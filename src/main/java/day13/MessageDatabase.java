package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
       /*
       1- Почему в список messages добавляем в том числе и пользователей, а не просто тексты сообщений?
        */
    }

    public static List<Message> getMessages(){
        return messages;

    }

    public static void showDialog(User u1, User u2){
        System.out.println();
        /*
      2 -  в этом методе надо реализовать с помощью метода addNewMessage ? как вообще делать этот метод?

   Формат вывода должен быть таким:

user1: Привет!
user2: Привет, user1!
Где user1 и user2 - имена пользователей u1 и u2.  Имена пользователей это поле username из класса User.
Или имеется в виду имена объектов класса User?
         */
    }


}
