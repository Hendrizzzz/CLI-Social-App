package dto;

public class UserWithOnlyUserNameDTO {
    public final String USERNAME;


    public UserWithOnlyUserNameDTO(String username) {
        USERNAME = username;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
}
