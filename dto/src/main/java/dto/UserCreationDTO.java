package dto;

import java.time.LocalDate;

public class UserCreationDTO {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final LocalDate birthDate;
    private final char GENDER;
    private final String USER_NAME;
    private final String PASSWORD;

    public UserCreationDTO(String FIRST_NAME, String LAST_NAME, LocalDate birthDate, char GENDER, String USER_NAME, String PASSWORD) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.birthDate = birthDate;
        this.GENDER = GENDER;
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }


    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public char getGENDER() {
        return GENDER;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
