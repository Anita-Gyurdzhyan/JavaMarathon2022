package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;


    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель:" + manufacturer + ", " + "год выпуска:" + year + "," + "длина:" + length + ","
                + "вес:" + weight + "," + "количество топлива в баке: " + fuel);
    }


    public void fillUp(int n) {
        fuel += n;
    }

    public static void compareAirplanes(Airplane s7, Airplane aeroflot) {
        if (s7.length > aeroflot.length) {
            System.out.println("Длинее самолет s7");

        } else {
            System.out.println("Длинне самолет aeroflot");
        }
    }

}
//Вопрос 1  - здесь привязываюсь к конкретному объекту при выводе  в консоль,
// если имя объекта поменяют то мой вывод имени неверный, так нельзя делать? Если нельзя,  то как выводить имя объекта?

//Вопрос 2 - Почему в классе Airplane не могу обратиться через точку к методу статическому?
// То есть вот так Airplane.compareAirplanes. В видео обращается в классе Human к статическому методу