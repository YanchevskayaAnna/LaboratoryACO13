package controller;


import model.*;

import java.util.Date;
import java.util.List;

public class DoctorController implements IDoctorController {

    private LaboratoryDB laboratoryDB;

    public DoctorController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    @Override
    public Patient addPatient(String login, String pass) {
        return null;
    }

    @Override
    public Boolean removePatient(int id) {
        return null;
    }

    @Override
    public Patient searchPatientByID(int id) {
        return null;
    }

    @Override
    public Patient searchPatientByLogin(String login) {
        return null;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(Patient patient) {
        return null;
    }

    @Override
    public List<Analysis> showAnalysisOfPatient(Patient patient, Doctor doctor) {
        return null;
    }

    @Override
    public Boolean createAnalysis(Patient patient, Date date, KindOfAnalysis kind) {
        return null;
    }

    @Override
    public Analysis findAnalysis(Patient patient, KindOfAnalysis kind) {
        return null;
    }

    @Override
    public void saveHistory(String file, Patient patient) {

    }

    @Override
    public List<Analysis> downloadHistory(String file) {
        return null;
    }
    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }
}
