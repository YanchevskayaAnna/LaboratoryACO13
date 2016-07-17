package view;

import db.LaboratoryDB;
import model.MedPersonal;

import javax.swing.*;

/**
 * Created by gorobec on 17.07.16.
 */
public class DoctorFrame extends JFrame{


    public DoctorFrame(MedPersonal result, LaboratoryDB db) {

        setTitle("DoctorFrame");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
