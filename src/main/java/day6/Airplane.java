package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;
    private int refueling;

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info(){
        System.out.println("Изготовитель:" + manufacturer+ ", "+"год выпуска:" + year + "," + "длина:" + length  + ","
                + "вес:" + weight + "," + "количество топлива в баке: " + fuel);
    }

    public int  fillUp(int n){
         fuel += n;
        return fuel;

    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //Зачем геттер в этом методе? я его нигде не применила
    public int getFuel() {
        return fuel;
    }
}
