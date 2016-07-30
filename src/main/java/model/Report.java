package model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Report {

    private String id;
    private Status status;
    private LocalDate dateStart;
    private Patient patient;
    private Map<Analysis, Result> analyzes;
    private String conclusion;
    private LocalDate dateFinish;
    private List<MedPersonal> doctors;
    private MedPersonal assistant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Map<Analysis, Result> getAnalyzes() {
        return analyzes;
    }

    public void setAnalyzes(Map<Analysis, Result> analyzes) {
        this.analyzes = analyzes;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public List<MedPersonal> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<MedPersonal> doctors) {
        this.doctors = doctors;
    }

    public MedPersonal getAssistant() {
        return assistant;
    }

    public void setAssistant(MedPersonal assistant) {
        this.assistant = assistant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;

        return !(id != null ? !id.equals(report.id) : report.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
