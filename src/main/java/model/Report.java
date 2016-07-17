package model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private int id;
    private LocalDate date;
    private LocalDate dateFinish;
    private User doctor;
    private User patient;
    private User assistant;
    private Status status;
    private Diagnosis diagnosis;

    private List<Analysis> analyzes = new ArrayList<>();
}
