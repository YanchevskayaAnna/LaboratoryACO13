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




    //    private List<Analysis> analyzes = new ArrayList<>();
}
