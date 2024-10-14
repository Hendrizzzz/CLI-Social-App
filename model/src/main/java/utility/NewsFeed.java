package utility;

import java.util.ArrayList;

public class NewsFeed {
    ArrayList<Post> posts;

    public NewsFeed() {
        posts = new ArrayList<>();
    }

    public void addNewsFeed(Post post) {
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
