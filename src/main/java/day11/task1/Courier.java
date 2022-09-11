package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int cashBonus; // денежная премия

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public int doWork() {
        warehouse.plusDelivered();
        return salary += 100;
    }

    @Override
    public boolean bonus() {

        if (warehouse.getCountDeliveredOrders() == 10000){
            isPayed = true;
            cashBonus = 50000;
        } else if (warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountDeliveredOrders() > 10000){
            System.out.println("Бонус уже был выплачен");
        }
        return isPayed;

        }


    }


/*
Сотрудникам полагается бонус, в зависимости от персональных показателей: когда на складе собрано 10.000 заказов,
Сборщику выплачивается бонус в размере 70.000. Когда клиентам доставлено 10.000 заказов,
Курьеру выплачивается бонус в размере 50.000.
Если на складе несколько сотрудников одной категории, то оценивается их коллективная работа,
т.е. если 10 курьеров доставят каждый по 1000 заказов, то каждый курьер получит бонус.
Бонус сотрудникам должен выдаваться при вызове метода bonus().
Причем, если на складе не достигнуты необходимые показатели (10.000 собранных или доставленных заказов),
вызов метода bonus() не должен начислять денежную премию, а должен выводить в консоль сообщение “Бонус пока не доступен”.
 Бонус может быть выплачен только один раз.
При попытке повторной выплаты бонуса (повторный вызов метода bonus()
 */

/*
Курьер1 сделал свой doWork, на складе увеличилось кол-во доставленных заказов на 1.
Курьер2 сделал свой дуворк, на складе снова увеличилось, теперь значение 2.
Курьер3 сделал дуворк 9998раз, на складе кол-во заказов стало 10000 и курьер3 получил бонус.
Если курьеры 1 и 2 ещё по 1 заказу выполнят то тоже получат бонус.

Если сейчас тоже не понятно, тогда я бессилен
 */