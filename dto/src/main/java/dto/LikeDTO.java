package dto;

import java.util.Date;

public final class LikeDTO {
    private final boolean isAPost;
    private final int userIDWhoLiked;
    private final Date date;

    public LikeDTO(boolean isAPost, int userIDWhoLiked, Date date) {
        this.isAPost = isAPost;
        this.userIDWhoLiked = userIDWhoLiked;
        this.date = date;
    }

    public boolean isAPost() {
        return isAPost;
    }

    public int getUserIDWhoLiked() {
        return userIDWhoLiked;
    }


    public Date getDate() {
        return date;
    }



}
