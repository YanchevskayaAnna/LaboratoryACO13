package view;


import controller.DoctorController;
import model.Doctor;
import model.LaboratoryDB;

public class DoctorFrame {

    private DoctorController doctorController;
    private LaboratoryDB laboratoryDB;
    private Doctor doctor;

    public DoctorFrame(DoctorController doctorController, Doctor doctor) {
        this.doctorController = doctorController;
        this.laboratoryDB = doctorController.getLaboratoryDB();
        this.doctor = doctor;
    }
}
