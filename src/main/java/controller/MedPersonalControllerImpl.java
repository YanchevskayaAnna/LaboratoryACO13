package controller;

import db.LaboratoryDB;
import exceptions.LoginException;
import exceptions.RegisterException;
import model.MedPersonal;
import model.Position;

import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public class MedPersonalControllerImpl implements MedPersonalController{

    private LaboratoryDB db;
    private MedPersonal medPersonal;

    public MedPersonalControllerImpl(LaboratoryDB db) {
        this.db = db;
    }

    @Override
    public MedPersonal logIn(String login, String password) throws LoginException {
//        todo validation
        this.medPersonal =  db.logIn(login, password);
        return medPersonal;

    }


    public LaboratoryDB getDb() {
        return db;
    }

    public void setDb(LaboratoryDB db) {
        this.db = db;
    }
}
