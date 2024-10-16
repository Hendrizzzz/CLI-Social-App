package interfaces.view;

import dto.UserFriendsDTO;

public interface FriendsViewInterface extends View {
    void displayFriends(UserFriendsDTO userFriendsDTO);
}
