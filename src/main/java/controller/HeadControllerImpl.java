package controller;

import db.LaboratoryDB;
import exceptions.PatientCreationException;
import exceptions.PatientNotFoundException;
import exceptions.RegisterException;
import exceptions.ValidationException;
import model.MedPersonal;
import model.Patient;
import model.Position;
import model.Report;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by gorobec on 17.07.16.
 */
public class HeadControllerImpl implements HeadController {
    private MedPersonal person;
    private LaboratoryDB db;

    public HeadControllerImpl(MedPersonal person, LaboratoryDB db) {
        this.person = person;
        this.db = db;
    }

    public MedPersonal getPerson() {
        return person;
    }

    public void setPerson(MedPersonal person) {
        this.person = person;
    }

    public LaboratoryDB getDb() {
        return db;
    }

    public void setDb(LaboratoryDB db) {
        this.db = db;
    }

    @Override
    public MedPersonal registerStaff(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email, String login, String pass, Position position) throws RegisterException, ValidationException {
        return null;
    }

    @Override
    public MedPersonal removeStaff(MedPersonal medPerson) {
        return null;
    }

    @Override
    public List<MedPersonal> showStaff() {
        return null;
    }

    @Override
    public List<MedPersonal> showStaffByPosition(Position position) {
        return null;
    }

    @Override
    public List<Report> showReports() {
        return null;
    }

    @Override
    public boolean takeNewReports() {
        return false;
    }

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
