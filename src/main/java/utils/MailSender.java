package utils;

import model.Report;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
/**
 * Created by gorobec on 20.07.16.
 */
public class MailSender {

    private static final String ENCODING = "UTF-8";
    private static final String SMTP_HOST ="smtp.gmail.com";
    private static final String LABORATORY_ADDRESS ="aco13labarotory@gmail.com";
    private static final String LOGIN ="aco13labarotory";
    private static final String PASSWORD ="dreams_come_true";
    private static final String SMTP_PORT ="587";

    public static void sendReportToPatient(Report report) throws UnsupportedEncodingException, MessagingException {
        String patientAddress = report.getPatient().getEmail();
        String content = report.getConclusion();
        String subject = "report # " + report.getId();
//        todo generate report.pdf or get path from db(resources)
        String attachmentPath = "";
//        sendMultiMessage(LOGIN, PASSWORD, LABORATORY_ADDRESS, patientAddress, content, subject, attachmentPath, SMTP_PORT, SMTP_HOST);
        sendSimpleMessage(LOGIN, PASSWORD, LABORATORY_ADDRESS, patientAddress, content, subject, SMTP_PORT, SMTP_HOST);
    }
/**
 * Send plain text massage*/
    private static void sendSimpleMessage(String login, String password, String from, String to, String content, String subject, String smtpPort, String smtpHost)
            throws MessagingException, UnsupportedEncodingException {
        Authenticator auth = new MyAuthenticator(login, password);

        Properties props = System.getProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);
        props.put("mail.mime.charset", ENCODING);
        Session session = Session.getDefaultInstance(props, auth);

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(from));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        msg.setSubject(subject);
        msg.setText(content);
        Transport.send(msg);
    }
/**
 * Send message with attachment
 * */
    private static void sendMultiMessage(String login, String password, String from, String to,
                                         String content, String subject, String attachment, String smtpPort, String smtpHost)
            throws MessagingException, UnsupportedEncodingException {

        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", smtpPort);
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.auth", "true");
        props.put("mail.mime.charset", ENCODING);

        Authenticator auth = new MyAuthenticator(login, password);
        Session session = Session.getDefaultInstance(props, auth);

        MimeMessage msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(from));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        msg.setSubject(subject, ENCODING);

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/plain; charset=" + ENCODING + "");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        MimeBodyPart attachmentBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(attachment);
        attachmentBodyPart.setDataHandler(new DataHandler(source));
        attachmentBodyPart.setFileName(MimeUtility.encodeText(source.getName()));
        multipart.addBodyPart(attachmentBodyPart);

        msg.setContent(multipart);

        Transport.send(msg);
    }

    private static class MyAuthenticator extends Authenticator {
        private String user;
        private String password;

        MyAuthenticator(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public PasswordAuthentication getPasswordAuthentication() {
            String user = this.user;
            String password = this.password;
            return new PasswordAuthentication(user, password);
        }
    }
}


