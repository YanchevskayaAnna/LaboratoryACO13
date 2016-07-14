package controller;

import model.Analysis;
import model.DestinationList;
import model.Patient;

import java.util.List;

public interface IDoctorController {

    Patient addPatient(String login, String pass);
    Patient searchPatientByID(int id);
    Patient searchPatientByLogin(String login);
    Boolean removePatient(int id);
    DestinationList createDestinationList(List<Analysis> analyzes, Patient patient);
    DestinationList searchDestinationList(int id);
    void saveHistory(String file, Patient patient);
    List<DestinationList> downloadHistory(String file);
}
