package model;

import java.util.ArrayList;
import java.util.List;

public class LaboratoryDB {

    private List<Analysis> analyzes = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Assistant> assistants = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Head> heads = new ArrayList<>();

    public List<Analysis> getAnalyzes() {
        return analyzes;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Assistant> getAssistants() {
        return assistants;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Head> getHeads() {
        return heads;
    }
}
