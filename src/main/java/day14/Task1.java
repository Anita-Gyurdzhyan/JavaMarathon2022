package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        File file = new File("Hometask14");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int counter = 0;

            int sum = 0;

            for (String number : numbersString) {

                numbers[counter++] = Integer.parseInt(number);


            }

            System.out.println(Arrays.toString(numbers));


            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

            }
            scanner.close();
            /*1 -  в первом варианте решения этой таски ты сказал, что поток надо закрывать после завершения метода.
             Но там он не знает переменную scanner. Если вынести строку Scanner scanner = new Scanner(file); до строчки с try, то
             idea просит добавить в метод throws. Где тогда лучше закрывать поток в нынешнем варианте решения таски?

             2- и отсюда второй вопрос, учитывая такой вид решения таски - если в самой сигнатуре метода printSumDigits(File file)
             написать  throws FileNotFoundException, ArrayIndexOutOfBoundsException и при этом try писать,
             то throws  в методе уже лишнее?
            */

            System.out.println("Сумма чисел " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }


    }

}


