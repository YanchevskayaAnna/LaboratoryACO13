package controller;

import exceptions.RegisterException;
import model.Position;

import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public interface HeadController extends DoctorController {
    boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                     String email,  String login, String pass, Position position) throws RegisterException;
}
