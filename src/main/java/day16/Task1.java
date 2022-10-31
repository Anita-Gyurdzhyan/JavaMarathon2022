package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Hometask14");
        printResult(file);

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            double sumArithmetic = 0;

            for (String num : numberString) {
                sumArithmetic += Double.parseDouble(num) / numberString.length;


            }

            System.out.println(sumArithmetic);
            System.out.printf("%.3f", sumArithmetic);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
// Все ли так сделано?
