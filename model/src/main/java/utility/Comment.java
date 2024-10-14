package utility;

import java.util.Date;

public class Comment {
    private int commentID;
    private int postID;
    private int commentAuthorID;
    private String contents;
    private Date dateCommented;

    public Comment(int commentID, int commentAuthorID, String contents, Date dateCommented) {
        this.commentID = commentID;
        this.commentAuthorID = commentAuthorID;
        this.contents = contents;
        this.dateCommented = dateCommented;
    }

    public int getCommentID() {
        return commentID;
    }

    public int getPostID() {
        return postID;
    }

    public int getCommentAuthorID() {
        return commentAuthorID;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDateCommented() {
        return dateCommented;
    }

    // TODO : Improve this
    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", contents='" + contents + '\'' +
                ", dateCommented=" + dateCommented +
                '}';
    }
}
