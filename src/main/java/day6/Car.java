package day6;

public class Car {
    private int yearRelase;

    void info(){
        System.out.println("Это автомобиль");
    }

    public int  yearDifference(int inputYear){
        return inputYear - yearRelase;
     }

    public void setYearRelase(int yearRelase) {
        this.yearRelase = yearRelase;
    }
}
