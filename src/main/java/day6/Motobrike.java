
package day6;

public class Motobrike {
    private String model;
    private String color;
    private int yearRelase;


    public Motobrike(String model, String color, int yearRelase) {
        this.model = model;
        this.color = color;
        this.yearRelase = yearRelase;
    }

    public void getInfo(){
        System.out.println("Из класса Мотоцикл " + model + "," + color + "," + yearRelase);
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
         return Math.abs(inputYear - yearRelase);

    }


}


