package concrete;

import dto.UserAuthenticationDTO;
import dto.UserCreationDTO;
import main.ApplicationContext;
import runtime.*;
import service.AuthenticationService;
import interfaces.view.LandingPageInterface;
import interfaces.controller.AuthenticationActionListener;

public class AuthenticationController implements AuthenticationActionListener{
    private AuthenticationService authenticationService;
    private ApplicationContext context;
    private LandingPageInterface landingPage;


    public AuthenticationController(AuthenticationService authenticationService, ApplicationContext context, LandingPageInterface landingPage) {
        this.authenticationService = authenticationService;
        this.context = context;
        this.landingPage = landingPage;
    }



    @Override
    public void onLogIn() {
        landingPage.displayLogIn();
    }


    @Override
    public void onSignUp() {
        landingPage.displaySignUp();
    }

    @Override
    public void createAccount(UserCreationDTO user) {
        try {
            authenticationService.addUser(user);
            landingPage.displayMessage("Account Creation Successful! ");
            context.switchTo(NewsFeedController.class);
        } catch (InvalidNameException | InvalidAgeException | InvalidGenderException | InvalidPasswordException e) {
            landingPage.displayMessage(e.getMessage());
        }
    }

    @Override
    public void authenticate(UserAuthenticationDTO user) {
        try {
            authenticationService.validateUser(user);
            landingPage.displayMessage("You have successfully logged in! ");
            context.switchTo(NewsFeedController.class);
        } catch (UserNotFoundException e) {
            landingPage.displayMessage(e.getMessage());
        }
    }

    @Override
    public void start() {
        landingPage.display();
    }
}
