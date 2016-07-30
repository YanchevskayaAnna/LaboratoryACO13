package controller;

import exceptions.LoginException;
import exceptions.RegisterException;
import model.MedPersonal;
import model.Position;

import java.time.LocalDate;


public interface MedPersonalController {

    MedPersonal logIn(String login, String password) throws LoginException;

}
