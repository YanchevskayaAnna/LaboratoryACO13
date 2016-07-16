package controller;

import model.*;

import java.util.Date;
import java.util.List;

public interface IDoctorController {

    User addPatient(String login, String pass);
    Boolean removePatient(int id);
    User searchPatientByID(int id);
    User searchPatientByLogin(String login);

    List<Analysis> showAnalysisOfPatient(User patient);
    List<Analysis> showAnalysisOfPatient(User patient, User doctor);

    Boolean createAnalysis(User patient, Date date, KindOfAnalysis kind);
    Analysis findAnalysis(User patient, KindOfAnalysis kind);

    void saveHistory(String file, User patient);
    List<Analysis> downloadHistory(String file);
}
