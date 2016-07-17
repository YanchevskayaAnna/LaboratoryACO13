package view;

import controller.MedPersonalController;
import controller.MedPersonalControllerImpl;
import exceptions.LoginException;
import model.MedPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPassFrame extends JFrame {

    private MedPersonalControllerImpl controller;


    private JTextField login;
    private JTextField password;


    public LoginPassFrame(MedPersonalControllerImpl controller) throws HeadlessException {
        this.controller = controller;

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
    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MedPersonal result = null;
            try {
                result = controller.logIn(login.getText(), password.getText());
                switch (result.getPosition()){
                    case DOCTOR:
                        new DoctorFrame(result, controller.getDb());
                        break;
                    /*case ASSISTANT:
                        new AssistantFrame(result, controller.getDb());
                        break;
                    case HEAD:
                        new HeadFrame(result, controller.getDb());
                        break;*/
                }
                LoginPassFrame.this.dispose();
            } catch (LoginException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(LoginPassFrame.this,
                        e1.getMessage(),
                        e1.getClass().getName(),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
