package utility;

import java.util.Date;

public class Post {
    private int postID;
    private int authorID;
    private String contents;
    private Date datePosted;
    private char privacy;
    private int commentCount;


    public Post(int postID, int authorID, String contents, Date datePosted, char privacy, int commentCount) {
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

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public char getPrivacy() {
        return privacy;
    }

    public void setPrivacy(char privacy) {
        this.privacy = privacy;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
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
