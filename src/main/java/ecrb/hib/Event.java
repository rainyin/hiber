package ecrb.hib;

import java.util.Date;

public class Event {
    private Long Id;

    private String title;
    private Date date;

    public Event() {}

    public Long getId() {
        return Id;
    }

    private void setId(Long id) {
        this.Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}