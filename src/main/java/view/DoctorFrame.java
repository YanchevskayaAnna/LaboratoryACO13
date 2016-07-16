package view;


import controller.DoctorController;
import model.LaboratoryDB;
import model.User;

import javax.swing.*;

public class DoctorFrame extends JFrame {

    private DoctorController doctorController;
    private LaboratoryDB laboratoryDB;
    private User doctor;

    public DoctorFrame(DoctorController doctorController, User doctor) {
        this.doctorController = doctorController;
        this.laboratoryDB = doctorController.getLaboratoryDB();
        this.doctor = doctor;

        setTitle("Doctor view");
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
