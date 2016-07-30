package controller;


import model.Report;

import java.util.List;

public interface PatientController {
    Report createReport();
    List<Report> findReports();

}
