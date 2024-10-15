package service;

import checker.InvalidAge;
import checker.InvalidKeywords;
import checker.InvalidPassword;
import dto.UserCreationDTO;
import dto.UserAuthenticationDTO;
import dao.UserDAO;
import runtime.*;
import utility.User;

import java.time.LocalDate;
import java.time.Period;

public class AuthenticationService {
    private UserDAO userDAO;

    public AuthenticationService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    /**
     * Adds a user into the database
     * @param user the user to be added
     * @throws InvalidNameException when the name of the user contains some illegal keywords
     * @throws InvalidPasswordException when the password of the user doesn't fit the must password
     * @throws InvalidAgeException when the user doesn't meet the minimum age which is 13
     * @throws InvalidGenderException when the specified gender of the user isn't male or female
     */
    public void addUser(UserCreationDTO user) {
        String firstName = user.getFIRST_NAME();
        String lastName = user.getLAST_NAME();
        String userName = user.getUSER_NAME();
        String password = user.getPASSWORD();
        char gender = user.getGENDER();
        LocalDate birthDate = user.getBirthDate();

        validateUserName(userName);
        validateFirstName(firstName);
        validateLastName(lastName);
        validatePassword(password);
        validateGender(gender);

        User newUser = new User(userName, firstName, lastName, password, birthDate, gender);
        userDAO.addUser(user);
    }


    public void removeUser(UserAuthenticationDTO user) {
        User userToBeRemoved = new User();
        userToBeRemoved.setUserName(user.getUSERNAME());
        userDAO.removeUser(userToBeRemoved);
    }


    public void validateUser(UserAuthenticationDTO user) {
        User userTOBeChecked = new User();
        userTOBeChecked.setUserName(user.getUSERNAME());
        userTOBeChecked.setPassword(user.getPASSWORD());

        if (!userDAO.isUserPresent(userTOBeChecked))
            throw new UserNotFoundException("Either username or password is wrong. ");
    }


    /**
     * Validates the first name of this user
     * @param firstName the first name to be Validates
     * @throws InvalidNameException when the name contains invalid keywords
     */
    private void validateFirstName(String firstName) {
        if (isInvalidName(firstName))
            throw new InvalidNameException("First Name contains an Invalid word. ");
    }

    // TODO : Implement this method
    private void validateUserName(String userName) {
    }

    /**
     * Validates the last name of this user
     * @param lastName the last name to be Validates
     * @throws InvalidNameException when the name to be Validates contains some invalid keywords
     */
    private void validateLastName(String lastName) {
        if (isInvalidName(lastName))
            throw new InvalidNameException("Last Name contains invalid keyword. ");
    }


    /**
     * Validates the password for the account of this user
     * @param password the password to be Validates
     */
    private void validatePassword(String password) {
        if (!isValidPassword(password))
            throw new InvalidPasswordException("The password must be at least 8 characters long and contains uppercase, lowercase, and a digit character. ");
    }


    /**
     * Validates the birthdate of this user
     * @param date the birthdate of this user
     * @throws InvalidGenderException when the age of this user is less than the minimum age, which is 13
     */
    private void validateBirthDate(LocalDate date) {
        int age = calculateAge(date);
        if (isValidAge(age))
            throw new InvalidAgeException("user is underage. ");
    }


    /**
     * Validates a gender
     * @param gender the gender to be validated
     * @throws InvalidGenderException when the gender is not male or female
     */
    private void validateGender(char gender) {
        if (isInvalidGender(gender))
            throw new InvalidGenderException("Gender not found. ");
    }


    private boolean isInvalidName(String firstName) {
        return InvalidKeywords.containsInvalidKeywords(firstName);
    }

    private boolean isValidPassword(String password) {
        return InvalidPassword.isPasswordValid(password);
    }

    private boolean isValidAge(int age) {
        return InvalidAge.isAgeValid(age);
    }

    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    private boolean isInvalidGender(char gender) {
        return  (gender != 'm' && gender != 'f' && gender != 'o');
    }

}
