package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private  String username;
    List<User> subscriptions; // В этом списке должны храниться те пользователи, на которых подписан пользователь.
    List<User> friends; // второй список взамной подписки


    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        // 1-  почему мы в конструкторе инициализиурем пустой список?
        this.friends = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {

        if (subscriptions.contains(user)) {
            return true;

        }

        else return false;
    }

    public void friend(User user){
        friends.add(user);
    }


    public boolean isFriend(User user){
       /* 2 - Я хотела реализовать так, когда второй пользователь в обратку подписался, тогда они Друзья.
         Это так надо писать - if (subscriptions.contains(user) & user.subscriptions.add()) ?
         Если да, то что писать внутри скобок после add?
        */

        if (subscriptions.contains(user) & friends.contains(user)){
            return true;
        }
        else return false;
    }

    public void sendMessage(User user, String text){
        /*3 - внутри метода addNewMessage в аргументах два пользователся. Не понимаю, тогда зачем в методе sendMessage аргумент user,
        если внутри addNewMessage уже два пользователя общаются.
        Как метод тут применить? Написала так по подсказке из чата, но третий аргумент text не знаю как писать
        MessageDatabase.addNewMessage(this.username, this.username);

        4 - ключевое слово внутри метода используем, если надо вызвать поле того класса, в котором написан метод?

         */
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
