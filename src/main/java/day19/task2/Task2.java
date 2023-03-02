package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;

        /*String carsFile = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "src" + separator +
                "main" + separator + "resources" + separator + "taxi_cars.txt";

         */
       // File file = new File(carsFile);

        File myFile = new File("Hometask14");

        try {

            Map<Integer, Point> map = new HashMap<>();
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");

                for (int i = 0; i < line.length; i++) {
                    map.put(Integer.parseInt(line[0]), new Point(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
                }

            }
            System.out.println("наша мапа " + map.toString());

            scanner.close();

            Scanner enterNumber = new Scanner(System.in);
            System.out.println("Введите 4 числа- координаты квадрата (x1, y1, x2, y2)");

            String[] coordinates = enterNumber.nextLine().split(" ");
            int countCars = 0;

            for (Map.Entry<Integer, Point> entry:map.entrySet()) {
               if (Integer.parseInt(coordinates[0]) > entry.getValue().getX() &&
                       Integer.parseInt(coordinates[1]) > entry.getValue().getY() ||
                (Integer.parseInt(coordinates[2]) < entry.getValue().getX() &&
                        Integer.parseInt(coordinates[3]) > entry.getValue().getY())) {
                   System.out.println("Id машин, находящиеся внутри квадрата " + entry.getKey());
                   countCars++;
               }

            }
            System.out.println("Общее количество машин в квадрате "+ countCars);
            /*
            Вопрос 1 - Здесь, конечно так много логики, и она  предполагаю, что неверная. Как все-таки понять
            квадрат захватил координаты какой либо машины или нет?
            я думала так если х1>CarX и одновременно у1>CarY или
                              х1<CarX и одновременно у1>CarY
             */


            /*
            Вопрос 2 - а зачем в классе Point нам методы equals и hashCode ?
             */

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Необходимо ввести 4 цифры");
        }
    }
}