package interfaces.controller;

import dto.UserDTO;

public interface NewsFeedActionListener extends Controller {
    void getNewsFeed(UserDTO currentUser);
    void handleNavigationRequest(String action);
}
