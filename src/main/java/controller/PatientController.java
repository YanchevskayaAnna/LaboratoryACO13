package controller;

import model.LaboratoryDB;

public class PatientController implements IPatientController {

    private LaboratoryDB laboratoryDB;

    public PatientController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
