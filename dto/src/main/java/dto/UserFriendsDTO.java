package dto;

import java.util.ArrayList;

public class UserFriendsDTO {
    private ArrayList<UserWithOnlyUserNameDTO> friends;

    public void addFriend(UserWithOnlyUserNameDTO friend){
        friends.add(friend);
    }

    public ArrayList<UserWithOnlyUserNameDTO> getFriends() {
        return friends;
    }
}
