package model;

import java.util.*;

public class LaboratoryDB {

    private Map<Integer, Report> reports = new HashMap<>();
    private Queue<Report> newReports = new PriorityQueue<>();
    private List<Report> reportsInProgress = new ArrayList<>();
    private List<User> doctors = new ArrayList<>();
    private List<User> assistants = new ArrayList<>();
    private List<User> patients = new ArrayList<>();
    private List<User> heads = new ArrayList<>();

    public Map<Integer, Report> getReports() {
        return reports;
    }

    public void setReports(Map<Integer, Report> reports) {
        this.reports = reports;
    }

    public Queue<Report> getNewReports() {
        return newReports;
    }

    public void setNewReports(Queue<Report> newReports) {
        this.newReports = newReports;
    }

    public List<Report> getReportsInProgress() {
        return reportsInProgress;
    }

    public void setReportsInProgress(List<Report> reportsInProgress) {
        this.reportsInProgress = reportsInProgress;
    }

    public List<User> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<User> doctors) {
        this.doctors = doctors;
    }

    public List<User> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<User> assistants) {
        this.assistants = assistants;
    }

    public List<User> getPatients() {
        return patients;
    }

    public void setPatients(List<User> patients) {
        this.patients = patients;
    }

    public List<User> getHeads() {
        return heads;
    }

    public void setHeads(List<User> heads) {
        this.heads = heads;
    }
}
