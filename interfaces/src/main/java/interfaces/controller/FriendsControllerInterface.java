package interfaces.controller;

import dto.UserDTO;

public interface FriendsControllerInterface extends Controller {
    void fetchAndDisplayFriends(UserDTO currentUser);
    void handleActionRequest(String request);
}
