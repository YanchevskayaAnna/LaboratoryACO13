package controller;


import exceptions.PatientCreationException;
import exceptions.PatientNotFoundException;
import model.Patient;

import java.time.LocalDate;
import java.util.List;

public class DoctorControllerImpl implements DoctorController {

    @Override
    public Patient createPatient(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email) throws PatientCreationException {
        return null;
    }

    @Override
    public Patient findPatient(String name, String surname, LocalDate dateOfBirth) throws PatientNotFoundException {
        return null;
    }

    @Override
    public List<Patient> allPatientsInAssistantProgress() {
        return null;
    }

    @Override
    public List<Patient> allPatientsInDoctorProgress() {
        return null;
    }

    @Override
    public List<Patient> allDonePatients() {
        return null;
    }
}
