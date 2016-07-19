Feature: MedPersonalControllerImpl

  Scenario: Registered user
    Given registered user with name Adam, surname Smith, login admin, password admin, phone +38(093) 777-77-77, dateOfBirth 1989 03 13, email adam@gmail.com
    When we try to log in system with login admin and password admin
    Then controller returned user should be equal to the register user