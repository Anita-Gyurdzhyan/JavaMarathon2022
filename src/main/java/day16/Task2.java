package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;

        String path1 = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "file1.txt";
        String  path2 = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "file2.txt";

        File file1 = new File(path1);
        File file2 = new File(path2);

        Random random = new Random();
        final int LIMIT = 19; //1 - Надо делать константу или в мейне не стоит?

        try {
            int[] arrayNum = new int[1000];
            PrintWriter pw1 = new PrintWriter(file1);

            for (int i = 0; i < arrayNum.length; i++) {
                int num = random.nextInt(101);
                arrayNum[i] = num;

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

                if (i == numGroup){
                    sumArithmetic = sum / count;
                    counter = i;


                    pw2.println(sumArithmetic);
                    numGroup+=  count;
                    sum = 0;
                    count = 0;
                    i = counter;
                    //2 - Много получилось всяких переменных, есть более деликатный метод или так тоже норм?
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
        String separator = File.separator;
        String path2 = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "file2.txt";
       File file2 = new File(path2);


        double d = 0;

        Scanner s = new Scanner(file2);
       while (s.hasNextDouble()){
           d = s.nextDouble();

       }
        s.close();
        System.out.println("я из метода printResult " +d);

/* 3 - Я не знаю как делать в методе printResult чтение файла, который был создан в мейне. Здесь надо также обявлять путь к файлу?
        вообщем, как делать?

 */

    }
}



