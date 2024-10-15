package main;

import dto.UserDTO;
import interfaces.controller.Controller;
import utility.User;

/**
 * The class to handle declaration and instantiation of core classes. Plus dependency injections.
 */
public class ApplicationContext {
    private Controller currentController;
    private User currentUser;

    public void switchTo(Class<? extends Controller> controllerClass) {
        try {
            currentController = controllerClass.getDeclaredConstructor(ApplicationContext.class).newInstance(this);
            currentController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}

