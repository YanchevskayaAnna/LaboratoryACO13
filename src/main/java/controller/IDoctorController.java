package controller;

import model.*;

import java.util.Date;
import java.util.List;

public interface IDoctorController {

    Patient addPatient(String login, String pass);
    Boolean removePatient(int id);
    Patient searchPatientByID(int id);
    Patient searchPatientByLogin(String login);

    List<Analysis> showAnalysisOfPatient(Patient patient);
    List<Analysis> showAnalysisOfPatient(Patient patient, Doctor doctor);

    Boolean createAnalysis(Patient patient, Date date, KindOfAnalysis kind);
    Analysis findAnalysis(Patient patient, KindOfAnalysis kind);

    void saveHistory(String file, Patient patient);
    List<Analysis> downloadHistory(String file);
}
