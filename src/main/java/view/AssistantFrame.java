package view;


import controller.AssistantController;
import model.Assistant;
import model.LaboratoryDB;

public class AssistantFrame {

    private AssistantController assistantController;
    private LaboratoryDB laboratoryDB;
    private Assistant assistant;

    public AssistantFrame(AssistantController assistantController, Assistant assistant) {
        this.assistantController = assistantController;
        this.laboratoryDB = assistantController.getLaboratoryDB();
        this.assistant = assistant;
    }
}
