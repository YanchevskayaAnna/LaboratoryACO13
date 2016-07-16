package controller;


import model.*;

import java.util.Date;
import java.util.List;

public class DoctorController implements IDoctorController {

    private LaboratoryDB laboratoryDB;

    public DoctorController() {
    }

    public DoctorController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    @Override
    public User addPatient(String login, String pass) {
        return null;
    }

    @Override
    public Boolean removePatient(int id) {
        return null;
    }

    @Override
    public User searchPatientByID(int id) {
        return null;
    }

    @Override
    public User searchPatientByLogin(String login) {
        return null;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(User patient) {
        return null;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(User patient, User doctor) {
        return null;
    }

    @Override
    public Boolean createAnalysis(User patient, Date date, KindOfAnalysis kind) {
        return null;
    }

    @Override
    public Analysis findAnalysis(User patient, KindOfAnalysis kind) {
        return null;
    }

    @Override
    public void saveHistory(String file, User patient) {

    }

    @Override
    public List<Analysis> downloadHistory(String file) {
        return null;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
