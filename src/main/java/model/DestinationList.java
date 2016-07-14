package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DestinationList {

    private int id;
    private Date date;
    private Doctor doctor;
    private Patient patient;
    private Status status;
    private List<Analysis> analyzes;
    private String diagnosis;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Analysis> getAnalyzes() {
        return analyzes;
    }

    public void setAnalyzes(ArrayList<Analysis> analyzes) {
        this.analyzes = analyzes;
    }
}
