package view;


import controller.AssistantController;

import model.LaboratoryDB;
import model.User;

import javax.swing.*;

public class AssistantFrame extends JFrame {

    private AssistantController assistantController;
    private LaboratoryDB laboratoryDB;
    private User assistant;

    public AssistantFrame(AssistantController assistantController, User assistant) {
        this.assistantController = assistantController;
        this.laboratoryDB = assistantController.getLaboratoryDB();
        this.assistant = assistant;

        setTitle("Assistant view");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init(){
        //TODO
    }
}
