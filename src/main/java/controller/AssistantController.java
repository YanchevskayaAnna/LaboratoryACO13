package controller;


import model.Analysis;
import model.LaboratoryDB;

import java.util.List;

public class AssistantController implements IAssistantController {

    private LaboratoryDB laboratoryDB;

    public AssistantController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    @Override
    public List<Analysis> showNewAnalyzes() {
        return null;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
