package utility;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import checker.*;
import runtime.*;


public class User {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private int age;
    private LocalDate birthDate;
    private char gender;
    private int friendsCount;
    private LocalDate joinDate;
    private String whoCanSendFriendRequest;
    private String whoCanCommentOnMyPosts;

    public User() {

    }


    public User(String userName, String firstName, String lastName, String password, LocalDate birthDate, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birthDate = birthDate;
        this.gender = gender;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return this.id;
    }


    public String getFirstName() {
        return this.firstName;
    }


    /**
     * Gets the last name of this user
     * @return the last name of this user
     */
    public String getLastName() {
        return this.lastName;
    }



    /**
     * Gets the password for this user
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }


    /**
     * Gets the age of this user
     * @return the age of this user
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the age of this user
     * @param age the age to be set for this user (based on his birthday)
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the birthdate of this user
     * @return the birthdate of this user
     */
    public LocalDate getBirthDate() {
        return this.birthDate;
    }


    /**
     * Gets the gender of this object
     * @return gender
     */
    public char getGender() {
        return this.gender;
    }

    public int getFriendsCount() {
        return this.friendsCount;
    }


    public LocalDate getJoinDate() {
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


    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
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
