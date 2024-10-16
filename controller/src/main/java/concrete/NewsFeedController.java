package concrete;

import dto.NewsFeedDTO;
import dto.UserDTO;
import interfaces.controller.NewsFeedActionListener;
import interfaces.view.NewsFeedViewInterface;
import main.ApplicationContext;
import service.UserService;
import utility.User;

import java.time.LocalDate;

public class NewsFeedController implements NewsFeedActionListener {
    private ApplicationContext context;
    private UserService userService;
    private NewsFeedViewInterface newsFeed;

    public NewsFeedController(ApplicationContext context, UserService userService, NewsFeedViewInterface newsFeed) {
        this.context = context;
        this.userService = userService;
        this.newsFeed = newsFeed;
    }

    @Override
    public void start() {
        User currentUser = context.getCurrentUser();
        UserDTO currentUserDTO = convertToDTO(currentUser);
        getNewsFeed(currentUserDTO);
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
    public void getNewsFeed(UserDTO currentUser) {
        NewsFeedDTO newsFeedOfCurrentUser = userService.getNewsFeed(currentUser);
        newsFeed.displayNewsFeed(newsFeedOfCurrentUser);
    }

    @Override
    public void handleNavigationRequest(String action) {
        switch (action) {
            case "friends" -> context.switchTo(FriendsController.class);
            case "settings" -> context.switchTo(SettingsController.class);
            case "notifications" -> context.switchTo(NotificationController.class);
            case "search" -> context.switchTo(SearchController.class);
            case "profile" -> context.switchTo(ProfileController.class);
            case "log out" -> context.switchTo(AuthenticationController.class);
            default -> System.out.println("Invalid navigation. Request not found. ");
        }
    }


}
