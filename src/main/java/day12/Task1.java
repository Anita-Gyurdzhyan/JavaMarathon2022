package day12;

/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль,
удалить самый первый автомобиль из списка. Вывести список в консоль.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("Mers");
        carBrands.add("BMV");
        carBrands.add("Audi");
        carBrands.add("Mustang");
        carBrands.add("Vaz");

        System.out.println(carBrands);

      carBrands.add(2, "Toyota");
      carBrands.remove(0);
        System.out.println(carBrands);

    }

}
