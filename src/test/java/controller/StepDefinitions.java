package controller;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.LoginException;
import model.MedPersonal;
import model.Position;
import utils.DBUtils;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


/**
 * Created by gorobec on 19.07.16.
 */
public class StepDefinitions {
//
    private MedPersonalControllerImpl controller;
    private MedPersonal person;
    private MedPersonal result;

    @Given("^registered user with name (.*), surname (.*), login (.*), password (.*), phone (.*), dateOfBirth (\\d+) (\\d+) (\\d+), email (.*)$")
    public void registered_user_with_name_surname_login_and_password(String name, String surname, String login, String password, String phone, int year, int month, int day, String email) throws IOException {
        this.person = new MedPersonal(name, surname, LocalDate.of(year, month, day), phone,email, login, password, Position.HEAD);
        this.controller = new MedPersonalControllerImpl(DBUtils.read());
    }
    @When("^we try to log in system with login (.*) and password (.*)")
    public void we_try_to_log_in_system_with_login_and_password(String login, String password) throws LoginException {
        this.result = controller.logIn(login, password);
    }


    @Then("^controller returned user should be equal to the register user$")
    public void controller_returned_user_should_be_equal_to_the_register_user(){
        assertEquals(person, result);
    }


}
