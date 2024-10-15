package dto;

public final class UserAuthenticationDTO {
    private final String USERNAME;
    private final String PASSWORD;

    public UserAuthenticationDTO(String USERNAME, String PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

}
