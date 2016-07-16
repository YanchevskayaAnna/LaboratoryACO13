package view;

import controller.*;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.json.simple.parser.ParseException;


public class LoginPassFrame extends JFrame {

    private LaboratoryDB laboratoryDB;
    private User user;

    private LoginWindowController loginWindowController;

    private JTextField login;
    private JTextField password;

    private JLabel incorrectPass;

    public LoginPassFrame(LoginWindowController loginWindowController) throws HeadlessException {
        this.loginWindowController = loginWindowController;
        this.laboratoryDB = loginWindowController.getLaboratoryDB();

        try {
            loginWindowController.updateDoctors();
            loginWindowController.updatePatients();
            loginWindowController.updateHeads();
            loginWindowController.updateAssistants();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        setTitle("login/pass");
        setSize(350, 125);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    void init(){

        login = new JTextField("");
        password = new JPasswordField("");
        setLayout(new GridLayout(3, 2));

        getContentPane().add(new JLabel("login:"));
        getContentPane().add(login);
        getContentPane().add(new JLabel("password:"));
        getContentPane().add(password);

        JButton okButton = new JButton("OK");
        okButton.setMnemonic('O');
        okButton.setToolTipText("press after typing login and password");
        okButton.addActionListener(new MyActionListener());

        getContentPane().add(okButton);

        incorrectPass = new JLabel("",SwingConstants.CENTER);
        getContentPane().add(incorrectPass);
    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            LoginWindowController loginWindowController = new LoginWindowController(laboratoryDB);
            User user = loginWindowController.loginFrame(login.getText(),password.getText());
            if (user instanceof Doctor){
                DoctorFrame doctorFrame = new DoctorFrame(new DoctorController(laboratoryDB), (Doctor) user);
                setVisible(false);
            } else if (user instanceof Assistant){
                AssistantFrame assistantFrame = new AssistantFrame(new AssistantController(laboratoryDB),(Assistant)user);
                setVisible(false);
            } else if (user instanceof Head){
                HeadFrame headFrame = new HeadFrame(new HeadController(laboratoryDB),(Head)user);
                setVisible(false);
            } else if (user instanceof Patient){
                PatientFrame patientFrame = new PatientFrame(new PatientController(laboratoryDB),(Patient)user);
                setVisible(false);
            } else {
                login.setText("");
                password.setText("");
                incorrectPass.setText("invalid login or password");
                incorrectPass.setForeground(Color.red);
            }
        }
    }

}
