package controller;

import exceptions.PatientCreationException;
import exceptions.PatientNotFoundException;
import model.Patient;
import model.Report;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Created by gorobec on 17.07.16.
 */
public interface DoctorController {
    /**
     *
     * @return Doctors patient report with status NEW
     *
     * */
    Report createReport(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email)
            throws PatientCreationException;
//todo
    Patient findPatient(String name, String surname, LocalDate dateOfBirth) throws PatientNotFoundException;
/**
 *
 * @return Doctors patient reports with status IN_ASSISTANT_PROGRESS
 *
 * */
    Map<Patient, Report> allPatientsInAssistantProgress();

    /**
     *
     * @return Doctors patient reports with status IN_DOCTOR_PROGRESS,
     *
     * */
    Map<Patient, Report> allPatientsInProgress();

    /**
     *
     * @return Doctors patient reports with status DONE,
     *
     * */
    Map<Patient, List<Report>> allDonePatients();




}
