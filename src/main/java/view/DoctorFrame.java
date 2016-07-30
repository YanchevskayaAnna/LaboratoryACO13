package view;

import db.LaboratoryDB;
import model.MedPersonal;

import javax.swing.*;


public class DoctorFrame extends JFrame{


    public DoctorFrame(MedPersonal result, LaboratoryDB db) {

        setTitle("Doctor menu");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
