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

//