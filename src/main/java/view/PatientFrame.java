package view;

import controller.PatientController;
import model.LaboratoryDB;
import model.Patient;

import javax.swing.*;

public class PatientFrame extends JFrame {

    private PatientController patientController;
    private LaboratoryDB laboratoryDB;
    private Patient patient;

    public PatientFrame(PatientController patientController, Patient patient) {
        this.patientController = patientController;
        this.laboratoryDB = patientController.getLaboratoryDB();
        this.patient = patient;

        setTitle("Patient view");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init(){
        //TODO
    }
}
