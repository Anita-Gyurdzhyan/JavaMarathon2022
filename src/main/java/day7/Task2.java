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
        Player player1 = new Player(i, 6);
        Player player2 = new Player(i, 9);
        Player player3 = new Player(i, 3);
        Player player4 = new Player(i, 15);
        Player player5 = new Player(i, 2);
        Player player6 = new Player(i, 1);
        Player player7 = new Player(i, 4);
        Player player8 = new Player(i, 5);

       player2.run(6);
        player2.getStamina();
        System.out.println("Выносливость " + player2.getStamina());

        System.out.println("Количество игроков на поле " + Player.countPlayers);
        Player.info();

    }
}
//Вопрос 1 - как при создании объекта player1 и т д закинуть туда int i ? от рандома который .
// я в классе Player указала i в конструткоре но все равно что то не то

// Вопрос 2 - эта строка  player2.run(9) - как сделать чтобы он подтягивал выносливостьто значение,
// которое записано при создании объекта? то есть 9 число