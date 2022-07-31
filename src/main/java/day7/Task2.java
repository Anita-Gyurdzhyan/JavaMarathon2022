package day7;

/*В методе main() создать объект класса Random, который будет генерировать случайные числа.
Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные числа от 90 до 100.
Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
 Вывести количество игроков на поле.
*/
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(11) + 90;
        Player player1 = new Player(i);
        Player player2 = new Player(i);
        Player player3 = new Player(i);
        Player player4 = new Player(i);
        Player player5 = new Player(2);
        Player player6 = new Player(7);
        Player player7 = new Player(4);
        Player player8 = new Player(5);

       player4.run();
        System.out.println("Выносливость " + player4.getStamina());

        System.out.println("Количество игроков на поле " + Player.countPlayers);
        Player.info();

    }
}
//Вопрос 1 - теперь в конструткоре Player только i есть. Теперь, чтобы применить к какому либо игроку метод run,
// пока тот не выдохнется, мне надо как то с циклами поработать? или цикл внутр метода run надо заложить в классе Player ?

//Вопрос 2 - я у игрока 5 задала выносливость 2, почему при вызове метода run он уходит в -1 ?