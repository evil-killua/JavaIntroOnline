package Task2.bean;

import java.time.LocalDate;
import java.util.Objects;

public class Note {
    private String topic;
    private LocalDate date;
    private String mail;
    private String message;

    public Note() {

    }

    public Note(String topic, LocalDate date, String mail, String message) {
        this.topic = topic;
        this.date = date;
        this.mail = mail;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "topic='" + topic + '\'' +
                ", date=" + date +
                ", mail='" + mail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return topic.equals(note.topic) &&
                date.equals(note.date) &&
                mail.equals(note.mail) &&
                message.equals(note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, date, mail, message);
    }
}
