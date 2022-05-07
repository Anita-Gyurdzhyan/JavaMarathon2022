//С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
// и заполнить его случайными числами от 0 до 10 (включительно).
// Используя цикл for each вывести содержимое массива в консоль,
// а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива

package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scanner.nextInt();
        int[] array = new int[num];

        int min = 0;
        int max = 10;
        int diff = max - min;

        int countA = 0;
        int countB = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(diff + 1) + min;

        }
        for (int resultArray : array) {
            System.out.print(resultArray + " ");
            sum += resultArray;

        }
        System.out.println();

        System.out.println("Длина массива " + array.length);


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countA++;

            } else if (array[i] == 1) {
                countB++;

            }
        }
        System.out.println("Количество чисел больше 8: " + countA);
        System.out.println("Количество чисел равных 1: " + countB);

        for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 == 0) {
                countEven++;

            } else {
                countOdd++;
            }

        }

        System.out.println("Количество четных чисел " + countEven);
        System.out.println("Количество нечетных чисел " + countOdd);
        System.out.println("Сумма всех элементов массива " + sum);

    }
}




