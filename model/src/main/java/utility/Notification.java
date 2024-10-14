package utility;

import java.util.Date;

public class Notification {
    private String contents;
    private String type;
    private Date date;
    private boolean hasRead;

    public Notification(String contents, String type, Date date, boolean hasRead) {
        this.contents = contents;
        this.type = type;
        this.date = date;
        this.hasRead = hasRead;
    }

    public String getContents() {
        return contents;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public boolean isHasRead() {
        return hasRead;
    }

    public void setHasRead(boolean hasRead) {
        this.hasRead = hasRead;
    }


    // TODO : Improve this
    @Override
    public String toString() {
        return "Notification{" +
                "contents='" + contents + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
