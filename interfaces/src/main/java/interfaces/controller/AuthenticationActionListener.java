package interfaces.controller;

import dto.UserAuthenticationDTO;
import dto.UserCreationDTO;

public interface AuthenticationActionListener extends Controller{
    void onLogIn();
    void onSignUp();
    void createAccount(UserCreationDTO user);
    void authenticate(UserAuthenticationDTO user);
}
