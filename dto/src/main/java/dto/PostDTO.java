package dto;

import java.util.Date;

public final class PostDTO {
    private final int postID;
    private final int authorID;
    private final String contents;
    private final Date datePosted;
    private final char privacy;
    private final int commentCount;

    public PostDTO(int postID, int authorID, String contents, Date datePosted, char privacy, int commentCount) {
        this.postID = postID;
        this.authorID = authorID;
        this.contents = contents;
        this.datePosted = datePosted;
        this.privacy = privacy;
        this.commentCount = commentCount;
    }

    public int getPostID() {
        return postID;
    }

    public int getAuthorID() {
        return authorID;
    }


    public String getContents() {
        return contents;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public char getPrivacy() {
        return privacy;
    }

    public int getCommentCount() {
        return commentCount;
    }

    // TODO : improve this
    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", authorID=" + authorID +
                ", contents='" + contents + '\'' +
                ", datePosted=" + datePosted +
                ", privacy=" + privacy +
                ", commentCount=" + commentCount +
                '}';
    }
}
