package dto;

import java.util.Date;

public final class CommentDTO {
    private final int commentID;
    private final int commentAuthorID;
    private final String contents;
    private final Date dateCommented;


    public CommentDTO(int commentID, int commentAuthorID, String contents, Date dateCommented) {
        this.commentID = commentID;
        this.commentAuthorID = commentAuthorID;
        this.contents = contents;
        this.dateCommented = dateCommented;
    }

    public int getCommentID() {
        return commentID;
    }

    public int getCommentAuthorID() {
        return commentAuthorID;
    }

    public String getContents() {
        return contents;
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
