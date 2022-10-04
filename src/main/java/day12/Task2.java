package day12;

import java.util.ArrayList;
import java.util.List;

/*
2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список. Вывести список.

 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

       evenNumber(0, 30, num);
       evenNumber(300, 350, num);

    }

    public static void evenNumber(int a, int b, List<Integer>num){

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                num.add(i);
            }
        }

        System.out.println(num);

            }
    }

    // Мы создаем 2 разных списка с отпределенными числами или все в одном должно быть?
