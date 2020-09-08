package Task2.Note;

import java.time.LocalDate;

public class Note {
    String topic;
    LocalDate date;
    String mail;
    String message;

   public Note(String topic,LocalDate date,String mail,String message){
       this.topic=topic;
       this.date=date;
       this.mail=mail;
       this.message=message;
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

    public String toString(){

        return  "название: " + topic + "\n" +
               "дата: " + date +"\n" +
                "почта: " + mail +"\n"+
                "сообщение:" + message;
    }
}
