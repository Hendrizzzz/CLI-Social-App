package interfaces.view;

public interface LandingPageInterface extends View {
    void displayLogIn();
    void displaySignUp();
    void displayMessage(String errorMessage);
}
