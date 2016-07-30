package view;

import controller.AssistantController;
import controller.AssistantControllerImpl;
import db.LaboratoryDB;
import model.MedPersonal;

import javax.swing.*;

public class AssistantFrame extends JFrame {
    private AssistantController controller;

    public AssistantFrame(MedPersonal person, LaboratoryDB db) {
        this.controller = new AssistantControllerImpl(person, db);
        setTitle("Assistant menu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
