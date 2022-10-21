package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        File file = new File("people");

        System.out.println(parseFileToObjList(file));


    }


    public static List<Person> parseFileToObjList(File file) {

        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] namesArray = line.split(" ");
                String[] ageArray = line.split(" ");

                String nameFromFile = namesArray[0];
                /*1 - я просто так переменную int 0, это норм или надо было как то элементом массива обознаить?
                //Например ,  int ageFromFile = Integer.parseInt(namesArray[1]);
                Я получается написала 0,
                 но там же изначально файл заполнен

                 */
                int ageFromFile = 0;


                for (int i = 0; i < namesArray.length - 1; i++) {


                    System.out.println("получаю имя " + nameFromFile);

                }
                for (int j = 0; j < ageArray.length - 1; j++) {
                    ageFromFile = Integer.parseInt(ageArray[1]);

                    if (ageFromFile < 0) {
                        /*2 - Надо было конкретный тип исключения указывать, который именно на отрицательные числа предназначен?
                        Как вообще правильнее, всегда писать сам родитель класс Exception или ковырятся
                        в документации и искать конкретику?
                         */

                        throw new Exception();


                    } else {
                        System.out.println("получаю возраст " + ageArray[1]);
                    }
                }


                people.add(new Person(nameFromFile, ageFromFile));
            }


            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            /*
            3 - Если бы я сперва в блоке catch указала бы класс родитель -Exception, и только в втором блоке FileNotFoundException,
            то получается FileNotFoundException я бы не словила бы?
             */

        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        /*
        4 - FileNotFoundException e или Exception e - здесь "e" - это объект класса Exception? Если да, то
        получается в разных видах исключения пишем одно и тоже "e". Это норм?
         */
        return people;


    }

}
