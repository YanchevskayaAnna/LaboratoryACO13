package controller;

import model.Analysis;
import model.LaboratoryDB;
import model.User;

import java.util.Date;
import java.util.List;

public class PatientController implements IPatientController {

    private LaboratoryDB laboratoryDB;

    public PatientController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(User patient) {
        return null;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(User patient, Date date) {
        return null;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
