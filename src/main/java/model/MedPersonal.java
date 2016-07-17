package model;

import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public class MedPersonal extends User {

    protected String login;
    protected String pass;
    private Position position;


    public MedPersonal(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email, String login, String pass, Position position) {
        super(name, surname, dateOfBirth, phoneNumber, email);
        this.login = login;
        this.pass = pass;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MedPersonal that = (MedPersonal) o;

        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        return (pass != null ? !pass.equals(that.pass) : that.pass != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MedPersonal{" + super.toString() +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", position=" + position +
                '}';
    }
}
