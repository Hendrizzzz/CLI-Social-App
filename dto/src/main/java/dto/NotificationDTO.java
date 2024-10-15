package dto;

import java.util.Date;

public final class NotificationDTO {
    private final String contents;
    private final String type;
    private final Date date;
    private final boolean hasRead;


    public NotificationDTO(String contents, String type, Date date, boolean hasRead) {
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
