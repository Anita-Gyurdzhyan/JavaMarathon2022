package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    final static int LIMIT = 19;

    public static void main(String[] args) {
        String separator = File.separator;

        String path1 = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "file1.txt";
        String path2 = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "file2.txt";

        File file1 = new File(path1);
        File file2 = new File(path2);

        Random random = new Random();


        try {
            int[] arrayNum = new int[1000];
            PrintWriter pw1 = new PrintWriter(file1);

            for (int i = 0; i < arrayNum.length; i++) {
                arrayNum[i] = random.nextInt(101);

            }
            pw1.println(Arrays.toString(arrayNum));
            pw1.close();
            System.out.println(Arrays.toString(arrayNum));


            PrintWriter pw2 = new PrintWriter(file2);

            Scanner scanner = new Scanner(file1);
            int numGroup = LIMIT;

            double sum = 0;
            double sumArithmetic = 0;
            int count = 0;
            int counter = 0;

            for (int i = 0; i < arrayNum.length; i++) {
                sum += arrayNum[i];
                count++;

                if (i == numGroup) {
                    sumArithmetic = sum / count;
                    counter = i;


                    pw2.println(sumArithmetic);
                    numGroup += count;
                    sum = 0;
                    count = 0;
                    i = counter;

                }
            }
            pw2.close();
            scanner.close();


            printResult(file2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static void printResult(File file) throws FileNotFoundException {
        double d = 0;
        int a = 0;

        Scanner s = new Scanner(file); //переименовал убрав двойку. Теперь в сканер будет передана ссылка на файл из аргументов метода
        while (s.hasNextDouble()) {
            d += s.nextDouble();
            System.out.println("я читаю" + d);
            // 1- он не считывает ничего, как быть? файл 2 создается

        }
        d = a;
        //2 - если бы считал файл, то верно написан метод?
        s.close();
        System.out.println("Вывожу, отбросив вещественную часть" + d);


    }
}



