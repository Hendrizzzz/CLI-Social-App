package concrete;

import dto.UserDTO;
import dto.UserFriendsDTO;
import interfaces.controller.FriendsControllerInterface;
import interfaces.view.FriendsViewInterface;
import main.ApplicationContext;
import service.UserService;
import utility.User;

import java.time.LocalDate;

public class FriendsController implements FriendsControllerInterface  {
    private UserService userService;
    private FriendsViewInterface friendsView;
    private ApplicationContext context;


    public FriendsController(UserService userService, FriendsViewInterface friendsView, ApplicationContext context) {
        this.userService = userService;
        this.friendsView = friendsView;
        this.context = context;
    }

    @Override
    public void start() {
        UserDTO currentUser = convertToDTO(context.getCurrentUser());
        fetchAndDisplayFriends(currentUser);
    }

    private UserDTO convertToDTO(User currentUser) {
        String userName = currentUser.getUserName();
        String firstName = currentUser.getFirstName();
        String lastname = currentUser.getLastName();
        char gender = currentUser.getGender();
        LocalDate birthDate = currentUser.getBirthDate();
        int friendsCount = currentUser.getFriendsCount();
        LocalDate joinDate = currentUser.getJoinDate();

        return new UserDTO(userName, firstName, lastname, gender, birthDate, friendsCount, joinDate);
    }


    @Override
    public void fetchAndDisplayFriends(UserDTO currentUser) {
        UserFriendsDTO userFriendsDTO = userService.getFriends();
        friendsView.displayFriends(userFriendsDTO);
    }

    @Override
    public void handleActionRequest(String action) {
        switch (action) {
            case "back" -> context.switchTo(NewsFeedController.class);
            case "remove friend" ->
        }
    }

}
