package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1a {
    public static void main(String[] args) {

        File file = new File("words");

        Map<String, Integer> map = new HashMap<>();

        int value = 0;

        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()){
                String line = scanner.next();

                for (String key:line.split(" ")) {

                    if (map.containsKey(key)) {
                        value++;
                    }else {
                        value = 1;
                    }

                    map.put(key, value);

                }


                }
            System.out.println(map);


            System.out.println("Сколько раз используется слово банан " + map.get("банан"));
            /*Вопрос 1 - я пока проверяю на своем файле, Почему слово банан он отсчитывает только 2 раза?.написнао 4 раза в файле
            Ну и в принципе он не все слова считает количество правильно.
             Скрин вот тут https://pastenow.ru/K4P9V
             */


            Map.Entry< String, Integer > maxEntry = null;
            int count = 0;
            while (count < 3) {
                /*
                Вопрос 2 - в переменной count я задала 3, как вывести 3 часто встречающиеся слова. Но он проходится по всей карте,
                пока не кончится ее размер)) Почему так?  как сделать этот путь чтоб решить данный пункт в задаче. Или как то
                из карты в List бросить, и там считать пока не будет размер List тем, которые мы хотим. Но в List ведь не положишь
                данные ключ значение?
                 */

                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    /*
                    Вопрос 3 - этот цикл for я нашла в инете. сама не смогла написать( как понять что надо
                    присваивать maxEntry == null, иначе выходит исключение. как этот момент самим догадываться?
                     */

                    if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {

                        maxEntry = entry;
                        System.out.println("из цикла с entry " + maxEntry.getKey() + " " + maxEntry.getValue());
                    }
                    count++;

                }
                /*
                Вопрос 4 - получается, вцикле он не обрабатывает ключи, у которых значение такую же цифру имеет.
                Это норм,  так и требуется в задании?
                 */

            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

