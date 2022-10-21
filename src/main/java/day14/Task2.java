package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        File file = new File("people");


        System.out.println(parseFileToStringList(file));


    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                System.out.println("то что прочла " + line);
                String[] namesArray = line.split(" ");
                String[] ageArray = line.split(" ");

       /*1 - Я хоть и сомтрела в режиме дебаг, но не понимаю почему когда в цикле писала i < namesArray.length,
 то он выводил имя человека два раза?

      */
                for (int i = 0; i < namesArray.length - 1; i++) {
                    String nameForFile = namesArray[0];
                    System.out.println("имя из файла " + nameForFile);

                }
                for (int j = 0; j < ageArray.length - 1; j++) {
                    int ageFromFile = Integer.parseInt(ageArray[1]);
                    if (ageFromFile < 0) {
                        //2 -  IllegalArgumentException  - верно выбран тип исключения для обработки отрицательного возраста?
                        throw new IllegalArgumentException();


                    } else {
                        System.out.println("возраст из файла " + ageFromFile);

                    }
                    people.add(line);


                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


        return people;
    }

}


/*
выдерни из строки число, для этого раздели строку
 по пробелу на массив строк и обратись к элементу массива под индексом 1
 */


/*
тебе надо перебирать список, получать каждый элемент списка, который является строкой и его уже дробить на массив строк
вот сейчас остановись, отложи задание в сторону и углубись в тему "java работа со строками, методы строк"
 */