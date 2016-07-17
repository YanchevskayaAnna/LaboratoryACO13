package controller;

import exceptions.LoginException;
import exceptions.RegisterException;
import model.MedPersonal;
import model.Position;

import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public interface MedPersonalController {

    MedPersonal logIn(String login, String password) throws LoginException;

    boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                         String email,  String login, String pass, Position position) throws RegisterException;
}
