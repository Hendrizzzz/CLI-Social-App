package dto;

import java.util.ArrayList;

public class NewsFeedDTO {
    ArrayList<PostDTO> posts;

    public NewsFeedDTO() {
        posts = new ArrayList<>();
    }

    public void addNewsFeed(PostDTO post) {
        posts.add(post);
    }


    // TODO : improve
    @Override
    public String toString() {
        return "NewsFeed{" +
                "posts=" + posts +
                '}';
    }
}
