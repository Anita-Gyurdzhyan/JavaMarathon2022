package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Picker picker2 = new Picker(warehouse1);
        Courier courier = new Courier( warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker3 = new Picker(warehouse1);


        businessProcess(picker1);
        System.out.println(picker1.toString());
        System.out.println("Количество собранных заказов " + warehouse1.plusPicked());

        businessProcess(courier);
        System.out.println(courier.toString());

        System.out.println("Вызов второго сборщика на первом складе ");
      businessProcess(picker2);
        System.out.println(picker2.toString());

        System.out.println("Работа третьего сборщика на втором складе " + picker3.doWork());

    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 5; i++) {
            worker.doWork();
        }
        worker.bonus();

    }
}


/*Вопрос 1 - нормально ли что в классах поле cashBonus прописано или надо было писать в Warehousee?

Вопрос 2 - почему собранные(plusPicked) заказы в разных выводах разное количество выдают?
В методе toString на 1 единицу меньше дает

Вопрос 3 - создала второй склад, " Проконтролируйте, что у склада 1 и его сотрудников при этом значения не меняются.
" - у меня норм?

Вопрос 4 - про коллективную работу. "Если на складе несколько сотрудников одной категории, то оценивается их
коллективная работа,
 т.е. если 10 курьеров доставят каждый по 1000 заказов, то каждый курьер получит бонус." -

 Вот у меня на складе warehouse1 два сборщика работают. когда у обеих вызываешь метод businessProcess,
 то результаты должны быть одинаковы у обоих?
**/

