package model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private int id;
    private LocalDate date;
    private User doctor;
    private User patient;
    private Status status;

    private List<Analysis> analyzes = new ArrayList<>();
}
