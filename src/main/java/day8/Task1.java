package day8;

//1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная
// конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль
// сразу все числа из диапазона:
//0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        System.out.println("До начала кода по StringBuilder " + startTime1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200001; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb.toString());
        long stopTime1 = System.currentTimeMillis();
        System.out.print("\n После завершения кода " + stopTime1);
        System.out.print("\n Длительность работы по StringBuilder, в мс.: " +(stopTime1 - startTime1));


       long startTime2 = System.currentTimeMillis();
        System.out.println("До начала кода " + startTime2);

        String myString = new String();
        String x;
        for (int i = 0; i < 20001; i++) {
           x =  myString + i;
            System.out.print(x + " ");
        }

        long stopTime2 = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.print("\n После завершения кода " + stopTime2);
        System.out.print("\n Длительность работы, в мс.: " +(stopTime2 - startTime2));

    }
}
//Вопрос - Почему, когда я комментирую все что про myString и запускаю только про sb, в вывод не видно цифр от 0, а когда sb
// запускаю все цифры от 0 до 20000 видны в выводе?