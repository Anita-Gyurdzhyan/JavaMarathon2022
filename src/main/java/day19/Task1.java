package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;

        String text = "C:" + separator + "repo" + separator + "JavaMarathon2022" + separator + "src" + separator +
                "main" + separator + "resources" + separator + "dushi.txt";


        File file = new File(text);
        int value = 0;

        try {
            Map<String, Integer> map = new HashMap<>();

            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                for (String key : line.split(" ")) {

                    if (map.containsKey(key)) {
                        value = map.get(key) + 1;

                    } else {
                        value = 1;
                    }
                    map.put(key, value);
                }
            }
            scanner.close();

            System.out.println("Сколько раз используется слово Чичиков " + map.get("Чичиков")); //Чичиков- 315

            /*
            Вопрос 1 - Верно получился подсчет слова Чичиков? 315? И здесь мы ищем строго Чичиков, учитывая склонение,
            и регистр, верно? И кстати, а что если не  надо учитывать этот момент, то как найти такое слово? (Чичиков, Чикиова,
            чичиков и т д)
             */

            List<Map.Entry<String, Integer>> mapList = new ArrayList<>(map.entrySet());
            Collections.sort(mapList, new SortByValue());
            /*
            Вопрос 2 - Можно было мапу сразу создать через TreeSet чтобы он сразу был отсортирован?
               Если да, то напиши пжл шаги как так делать.
               Из мапы в список -  лишняя трата действий?

             */

            int count = 0;
            while (count < 100) {
                System.out.println("100 часто используемых слов: " + mapList.get(count));
                count++;
            }
            /*
            Вопрос 3 - Получается я ввожу и слово и значение в найденных чато используемых словах.
            В задании написано вывести именно слово или нет сильного требования?
            если бы слово только вывести то из mapList как чисто слова отделять?
             */

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}


