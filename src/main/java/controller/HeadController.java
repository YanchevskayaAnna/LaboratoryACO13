package controller;

import model.LaboratoryDB;

public class HeadController implements IHeadController {

    private LaboratoryDB laboratoryDB;

    public HeadController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
