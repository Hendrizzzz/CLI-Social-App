package utility;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import checker.*;
import runtime.*;


public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private int age;
    private Date birthDate;
    private char gender;
    private int friendsCount;
    private Date joinDate;
    private String whoCanSendFriendRequest;
    private String whoCanCommentOnMyPosts;

    public User() {

    }

    public static void main(String[] args) {
        System.out.println("So what is your name kid? ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("So your name is " + name);
    }

    public User(String firstName, String lastName, String password, Date birthDate, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
        setBirthDate(birthDate);
        setGender(gender);
    }

    public int getId() {
        return this.id;
    }


    public String getFirstName() {
        return this.firstName;
    }

    //TODO : change this into a custom exception
    public void setFirstName(String firstName) {
        if (isInvalidName(firstName))
            throw new InvalidNameException("First Name contains an Invalid word. ");

        this.firstName = firstName;
    }



    public String getLastName() {
        return this.lastName;
    }

    // TODO: change this into a custom exception
    public void setLastName(String lastName) {
        if (isInvalidName(lastName))
            throw new InvalidNameException("Last Name contains invalid keyword. ");

        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    // TODO: change this into a custom exception
    public void setPassword(String password) {
        if (!isValidPassword(password))
            throw new InvalidPasswordException("The password must be at least 8 characters long and contains uppercase, lowercase, and a digit character. ");

        this.password = password;
    }


    public int getAge() {
        return this.age;
    }

    // TODO: change this into a custom exception
    public void setAge(int age) {
        this.age = age;
    }


    public Date getBirthDate() {
        return this.birthDate;
    }

    // TODO : change this into a custom exception
    public void setBirthDate(Date date) {
        int age = calculateAge(date);
        if (isValidAge(age))
            throw new InvalidAgeException("user is underage. ");

        this.birthDate = date;
        setAge(age);
    }


    public char getGender() {
        return this.gender;
    }

    // TODO : change this into a custom exception
    public void setGender(char gender) {
        if (isInvalidGender(gender))
            throw new RuntimeException();

        this.gender = gender;
    }

    public int getFriendsCount() {
        return this.friendsCount;
    }


    public Date getJoinDate() {
        return this.joinDate;
    }


    public String getWhoCanSendFriendRequest() {
        return this.whoCanSendFriendRequest;
    }

    public void setWhoCanSendFriendRequest(String whoCanSendFriendRequest) {
        this.whoCanCommentOnMyPosts = whoCanSendFriendRequest;
    }


    public String getWhoCanCommentOnMyPosts() {
        return this.whoCanCommentOnMyPosts;
    }

    public void setWhoCanCommentOnMyPosts(String whoCanCommentOnMyPosts) {
        this.whoCanCommentOnMyPosts = whoCanCommentOnMyPosts;
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


    private int calculateAge(Date date) {
        Date currentDate = new Date();

        // Create Calendar instances
        Calendar birthCal = Calendar.getInstance();
        Calendar currentCal = Calendar.getInstance();

        birthCal.setTime(birthDate);
        currentCal.setTime(currentDate);

        int age = currentCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

        // Adjust for months and days
        if (currentCal.get(Calendar.MONTH) < birthCal.get(Calendar.MONTH) ||
                (currentCal.get(Calendar.MONTH) == birthCal.get(Calendar.MONTH) &&
                        currentCal.get(Calendar.DAY_OF_MONTH) < birthCal.get(Calendar.DAY_OF_MONTH)))
            age--;


        return age;
    }

    private boolean isInvalidGender(char gender) {
        return  (gender != 'm' && gender != 'f' && gender != 'o');
    }


    // TODO : improve this
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
