package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        File file = new File("Hometask1");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(file);

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }


        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[10];
        int counter = 0;

        int sum = 0;

        for (String number : numbersString) {

            numbers[counter++] = Integer.parseInt(number);


        }

        System.out.println(Arrays.toString(numbers));
        // 1- Надо закрывать поток после считывания файла или после завершения выполнения метода printSumDigits?
        scanner.close();

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("Сумма чисел " + sum);


    }

}

/*
2 - Не работает ни одна обработка исключение, что не так? Обработать исключение надо было в самом методе или в мейне?
 */

