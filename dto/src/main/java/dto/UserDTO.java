package dto;

import java.time.LocalDate;

public class UserDTO {
    private final String USERNAME;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final char GENDER;
    private final LocalDate BIRTH_DATE;
    private final int FRIENDS_COUNT;
    private final LocalDate JOIN_DATE;

    public UserDTO(String USERNAME, String FIRST_NAME, String LAST_NAME, char GENDER, LocalDate BIRTH_DATE, int FRIENDS_COUNT, LocalDate JOIN_DATE) {
        this.USERNAME = USERNAME;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.GENDER = GENDER;
        this.BIRTH_DATE = BIRTH_DATE;
        this.FRIENDS_COUNT = FRIENDS_COUNT;
        this.JOIN_DATE = JOIN_DATE;
    }


    public String getUSERNAME() {
        return USERNAME;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public LocalDate getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public int getFRIENDS_COUNT() {
        return FRIENDS_COUNT;
    }

    public LocalDate getJOIN_DATE() {
        return JOIN_DATE;
    }

    public char getGENDER() {
        return GENDER;
    }
}
