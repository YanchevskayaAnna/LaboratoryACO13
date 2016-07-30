package view;

import controller.HeadController;
import controller.HeadControllerImpl;
import db.LaboratoryDB;
import model.MedPersonal;

import javax.swing.*;


public class HeadFrame extends JFrame{
    private HeadController controller;

    public HeadFrame(MedPersonal person, LaboratoryDB db) {
        controller = new HeadControllerImpl(person, db);
        setTitle("Head menu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }



}
