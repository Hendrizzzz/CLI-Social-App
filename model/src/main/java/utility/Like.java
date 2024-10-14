package utility;

import java.util.Date;

public class Like {
    private boolean isAPost;
    private int userIDWhoLiked;
    private Date date;

    public Like(boolean isAPost, int userIDWhoLiked, Date date) {
        this.isAPost = isAPost;
        this.userIDWhoLiked = userIDWhoLiked;
        this.date = date;
    }

    public boolean isAPost() {
        return isAPost;
    }

    public void setAPost(boolean APost) {
        isAPost = APost;
    }

    public int getUserIDWhoLiked() {
        return userIDWhoLiked;
    }

    public void setUserIDWhoLiked(int userIDWhoLiked) {
        this.userIDWhoLiked = userIDWhoLiked;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
