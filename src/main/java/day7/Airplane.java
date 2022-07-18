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

    public String getManufacturer() {
        return manufacturer;
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
            System.out.println("Длинее самолет " + s7.getManufacturer());

        } else if (s7.length < aeroflot.length){
            System.out.println("Длинее самолет " + aeroflot.getManufacturer());
        } else {
            System.out.println("Длина обеих самолетов равны");
        }
    }

}
//Вопрос 1 - верно переделала?