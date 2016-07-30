package controller;

import db.LaboratoryDB;
import model.MedPersonal;
import model.Report;

import java.util.List;


public class AssistantControllerImpl implements AssistantController {
    private MedPersonal person;
    private LaboratoryDB db;

    public AssistantControllerImpl(MedPersonal person, LaboratoryDB db) {
        this.person = person;
        this.db = db;
    }

    public MedPersonal getPerson() {
        return person;
    }

    public void setPerson(MedPersonal person) {
        this.person = person;
    }

    public LaboratoryDB getDb() {
        return db;
    }

    public void setDb(LaboratoryDB db) {
        this.db = db;
    }

    @Override
    public List<Report> showReports() {
        return null;
    }

    @Override
    public boolean takeNewReports() {
        return false;
    }
}
