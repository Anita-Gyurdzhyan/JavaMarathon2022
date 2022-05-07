// Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
// Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
// Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
// мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
//Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.

package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int j = 0; j < 5; j++) {

            System.out.println("Введите делимое");
            double numFirst = scanner.nextDouble();
            System.out.println("Введите делитель");
            double numSecond = scanner.nextDouble();
            double result = numFirst / numSecond;

            if (numSecond == 0) {
                System.out.println("Деление на 0");
                continue;


            } else {
                System.out.println("Результат деления " + result);


            }


        }

    }
}

