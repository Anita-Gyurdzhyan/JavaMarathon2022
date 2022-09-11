package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int cashBonus; // денежная премия

    public Picker( Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", собранные заказы= " + warehouse.plusPicked() +
                '}';
    }

    @Override
    public int doWork() {
        warehouse.plusPicked();
        return salary += 80;
    }

    @Override
    public boolean bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            isPayed = true;
            cashBonus =  70000;

        } else if (warehouse.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        } else if (isPayed()){
            System.out.println("Бонус уже был выплачен");
        }
        return isPayed;

    }
}



