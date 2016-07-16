package controller;

import com.sun.xml.internal.bind.v2.TODO;
import model.*;
import org.json.simple.parser.ParseException;

public class LoginWindowController {
    private LaboratoryDB laboratoryDB;

    public LoginWindowController(LaboratoryDB laboratoryDB) {
        this.laboratoryDB = laboratoryDB;
    }

    public LaboratoryDB getLaboratoryDB() {
        return laboratoryDB;
    }

    public void updateDoctors() throws ParseException {
        //TODO
    }

    public void updatePatients() throws ParseException {
        //TODO
    }

    public void updateHeads()throws ParseException{
        //TODO
    }

    public void updateAssistants() throws ParseException{
        //TODO
    }

    public User loginFrame(String login, String password){
        User user= null;
        for (Doctor doctor : laboratoryDB.getDoctors()){
            if (doctor.getLogin().equals(login) && doctor.getPass().equals(password)){
                user = doctor;
            }
        }
        if (user==null){
            for (Assistant assistant : laboratoryDB.getAssistants()){
                if (assistant.getLogin().equals(login) && assistant.getPass().equals(password)){
                    user = assistant;
                }
            }
        }

        if (user==null){
            for (Head head : laboratoryDB.getHeads()){
                if (head.getLogin().equals(login) && head.getPass().equals(password)){
                    user = head;
                }
            }
        }

        if (user==null){
            for (Patient patient : laboratoryDB.getPatients()){
                if (patient.getLogin().equals(login) && patient.getPass().equals(password)){
                    user = patient;
                }
            }
        }
        return user;
    }
}
