package controller;

import exceptions.RegisterException;
import exceptions.ValidationException;
import model.MedPersonal;
import model.Position;

import java.time.LocalDate;
import java.util.List;


public interface HeadController extends DoctorController, AssistantController {
    /**
     * todo docs
     *
     * @return registered person
     * @throws RegisterException   if person is already register
     * @throws ValidationException if some field had incorrect format
     */
    MedPersonal registerStaff(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                              String email, String login, String pass, Position position) throws RegisterException, ValidationException;
    /**
     *
     *
     * @return removed MedPersonal or null if last wasn't found
     *
     *
     * */
    MedPersonal removeStaff(MedPersonal medPerson);


    List<MedPersonal> showStaff();

    List<MedPersonal> showStaffByPosition(Position position);

}
