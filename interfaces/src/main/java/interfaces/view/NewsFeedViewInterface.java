package interfaces.view;

import dto.NewsFeedDTO;

public interface NewsFeedViewInterface extends View {
    void displayNewsFeed(NewsFeedDTO newsFeed);
}
