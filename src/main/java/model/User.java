package model;

public class User {

    private int id;
    private String login;
    private String pass;

    public User(int id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }
}
