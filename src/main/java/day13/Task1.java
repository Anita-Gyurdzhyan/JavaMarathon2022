package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Dina Minako");
        User user2 = new User("Kamilla Coelco");
        User user3 = new User("Jon");

        Message message = new Message(user1, user2, "Hello all people");
        Message message2 = new Message(user1, user2, "super star");

        MessageDatabase.addNewMessage(user1, user2, "OMG");

        System.out.println(MessageDatabase.getMessages());


    }
}

/*
1- зачем нам вообще объекты класса Message создавать? Вроде бы для списка messages, который параметризован классом Message.
Но вот я создала в мейне объекты класса Message. Эти объекты задействованы в методе addNewMessage. Я вызвала этот метод, и не
понимаю я пишу текст в аргументах,  а зачем тот текст, который при создании объекта класса Message ?

2 - метод addNewMessage - Отправка в нашем контексте означает добавление сообщения в нашу “базу данных. Вот я вызвала метод и потом
хочу проверить свой список.  вызываю getMessages. Это правильное поведение?


 */