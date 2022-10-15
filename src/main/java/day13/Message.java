package day13;

import java.util.Date;

public class Message {

    private User sender;
    public User receiver;
    private  String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
        date.setTime(date.getTime());

    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public  String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "" +
                "FROM:" + sender + '\n' +
                "TO:" + receiver + '\n'+
                "ON:" + date + '\n'+
             /* 1 - в поле ON должна быть дата создания объекта класса Message- то есть в мейне как я создаа объект,
                 и надо дату как то зафикисиовать, ? В конструткоре зафиксировала, но ерунда получилась

                2 -  Такой формат даты не соответствует? в задаче без тайм зоны
                */
                " " + text +
                "";
    }
}

/*
3 - в таком формате вывод подходит или надо без слов username, чтоб сразу их имена выдавались?

 */