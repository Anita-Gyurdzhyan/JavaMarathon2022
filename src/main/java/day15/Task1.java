package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, EmptyFileException, InvalidFormatException {
        /* 1 - Почему FileNotFoundException - серым а остальные типы исключений черным?
    И есть ли разница в сигнатре метода указание порядка? или хаотично тоже можно?

     */
        String separator = File.separator;

        String pathCsv = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "src" + separator +
                "main" + separator + "resources" + separator + "shoes.csv";

        String pathTxt = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "src" + separator +
                "main" + separator + "resources" + separator + "missing_shoes.txt";


        File file1 = new File(pathCsv);
        File file2 = new File(pathTxt);

        PrintWriter pw = new PrintWriter(file2);

        try {

            Scanner scanner = new Scanner(file1);
            if (file1.length() == 0) {
                throw new EmptyFileException("Переданный файл пустой");
            }


            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] arrayShoes = line.split(";");

                String countShoes = arrayShoes[2];
                for (int i = 2; i < arrayShoes.length; i++) {
                    /*
                    2 - это верно, если я в цикл кинула if на проверку формата файла?
                    3 - Рассмотрим негативный кейс - Если, скажем, последняя строка в pathCsv
                    имеет 4 столбец, я думала он все равно будет перебрасывать в новый файл pathTxt новые строки.
                    он же постепенно ходит по строкам и смотрит на arrayShoes[2] на соответсвие условию про countShoes == 0.
                    Получается он прошелся циклом по массиву, только в последней строке увидел 4 столбец ( я тестила) , и выкинул исключение
                    "Неверный формат файла" . А почему так? Он проходит и сразу видит весь массив, что где-то там внизу лишний столбец?

                     */

                    if (arrayShoes.length >= 3) {
                        throw new InvalidFormatException("Неверный формат файла");
                    }

                    if (Integer.parseInt(countShoes) == 0) {
                        /*
                        //4 - сперва я записывала так  pw.println(Arrays.toString(arrayShoes)); Правильнее чтоб строку именно получить, как сейчас
                         реализовано? И когда я делала, так то в массиве в консоль выходило
                         первая строка так-  ﻿Ботинки - что это такое ﻿?
                         */
                        String arrayShoesString = String.join(" ", arrayShoes);
                        /*
                        5- Почему при любом раскладе он всегда создает файл? если попадает на исключение, например,
                        пустой файл все равно создает новый файл. А это исключение (EmptyFileException) вообще находится до while
                         */
                        file2.createNewFile();
                        /*
                        6 - это нормально, когда файл новый создается джавой он красного цвета?
                         */

                        pw.println(arrayShoesString);
                    }

                }

            }
            pw.close();
            /*7 -оказывается обязательно надо закрывать поток записи, иначе он не записывает? Что-то явного акцента не увидела
            в статьсях всяких про запись в файл и на видео уроке нашем. Преподносят как рекомндательный характер. странно

             */

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
        }
        /*
        8 - как то эти два исключения не так работают. Что в них не так? Если указываю неверный путь у pathCsv, то пробрасывает исключение
         "Файл не найден",  а если у pathTxt, то пишет
         Exception in thread "main" java.io.FileNotFoundException: C:\repo\5JavaMarathon2022\src\main\resources\missing_shoes.txt
         (Системе не удается найти указанный путь)

         Хотя, в первом случае это также FileNotFoundException. Что не так с ними?
         */
    }
}
