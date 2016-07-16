package view;


import controller.AssistantController;
import model.Assistant;
import model.LaboratoryDB;

import javax.swing.*;

public class AssistantFrame extends JFrame {

    private AssistantController assistantController;
    private LaboratoryDB laboratoryDB;
    private Assistant assistant;

    public AssistantFrame(AssistantController assistantController, Assistant assistant) {
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
