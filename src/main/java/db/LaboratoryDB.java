package db;

import exceptions.LoginException;
import exceptions.RegisterException;
import model.*;

import java.time.LocalDate;
import java.util.*;

public class LaboratoryDB {

    private Map<String, Report> reports = new HashMap<>();
    private Queue<String> newReportsID = new PriorityQueue<>();
    private Map<MedPersonal, List<String>> assistantsReportsId = new HashMap<>();
    private Map<MedPersonal, List<String>> doctorsReportsId = new HashMap<>();
    private Map<String, MedPersonal> medPersonalsByLogin = new HashMap<>();
    private Map<Patient, List<String>> patientsReports = new HashMap<>();






    public MedPersonal logIn(String login, String password) throws LoginException {
        MedPersonal foundPerson = medPersonalsByLogin.get(login);
        if(foundPerson == null || !password.equals(foundPerson.getPass())){
            throw new LoginException("Wrong login or password!");
        }
        return foundPerson;
    }


    public MedPersonal saveMedPerson(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                                     String email, String login, String pass, Position position) throws RegisterException {

        if(medPersonalsByLogin.containsKey(login)) throw new RegisterException("Login is exist, try another login");
        MedPersonal medPersonal = new MedPersonal(name, surname, dateOfBirth, phoneNumber, email, login, pass, position);
        medPersonalsByLogin.put(login, medPersonal);
        return medPersonal;
    }

    public static LaboratoryDB create() {
        return null;
    }
}
