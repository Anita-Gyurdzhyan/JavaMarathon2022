// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.
package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int min = 0;
        int max = 10000;
        int diff = max - min;
        int largestNum = 0;

        int countZero = 0;
        int sumZero = 0;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(diff + 1) + min;

        }

        for (int randomArray : array) {
            System.out.print(randomArray + " ");

        }
        int smallestNum = array[0];


        for (int x : array) {

            if (x > largestNum) {
                largestNum = x;

            }
            if (x < smallestNum) {
                smallestNum = x;
            }
            if (x % 10 == 0) {
                countZero++;
                sumZero += x;
            }

        }
        System.out.println();

        System.out.println("Наибольший элемент массива: " + largestNum);
        System.out.println("Наименьший элемент массива: " + smallestNum);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);


    }
}


