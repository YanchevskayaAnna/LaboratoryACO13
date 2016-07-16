package controller;

import model.Analysis;
import model.User;

import java.util.Date;
import java.util.List;

public interface IPatientController {

    List<Analysis> showAnalysisOfPatient(User patient);
    List<Analysis> showAnalysisOfPatient(User patient, Date date);

}
