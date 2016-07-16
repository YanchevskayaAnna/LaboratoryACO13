package view;

import controller.PatientController;
import model.LaboratoryDB;
import model.Patient;

public class PatientFrame {

    private PatientController patientController;
    private LaboratoryDB laboratoryDB;
    private Patient patient;

    public PatientFrame(PatientController patientController, Patient patient) {
        this.patientController = patientController;
        this.laboratoryDB = patientController.getLaboratoryDB();
        this.patient = patient;
    }
}
