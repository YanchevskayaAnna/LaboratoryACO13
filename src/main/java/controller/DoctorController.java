package controller;

import exceptions.PatientCreationException;
import exceptions.PatientNotFoundException;
import model.Patient;
import model.Report;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public interface DoctorController {
    /**
     *Creates new Patient in database
     *
     * @param name name of new Patient
     * @param surname surname of new Patient
     * @param dateOfBirth birth day of new Patient
     * @param phoneNumber phone number of new Patient
     * @param email email address of new Patient
     *
     * @return new Patient instance
     *
     * @throws PatientCreationException if Patient already exist
     *
     * */
    Patient createPatient(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email)
            throws PatientCreationException;
    /**
     *Search certain Patient in database
     *
     * @param name name of searched Patient
     * @param surname surname of searched Patient
     * @param dateOfBirth birth day of searched Patient
     *
     * @return found Patient
     *
     * @throws PatientNotFoundException if Patient was not found
     * */

    Patient findPatient(String name, String surname, LocalDate dateOfBirth) throws PatientNotFoundException;

    /**
    *
    * @return Doctors patients with status IN_ASSISTANT_PROGRESS
    *
    * */
    List<Patient> allPatientsInAssistantProgress();

    /**
     *
     * @return Doctors patients with status IN_DOCTOR_PROGRESS,
     *
     * */
    List<Patient> allPatientsInDoctorProgress();

    /**
     *
     * @return Doctors patients with status DONE,
     *
     * */
    List<Patient> allDonePatients();



}
