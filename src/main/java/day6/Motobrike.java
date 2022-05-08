package day6;

public class Motobrike {
    private int yearRelase;

    void info(){
        System.out.println("Это мотоцикл");
    }

   public int yearDifference(int inputYear){
        return inputYear - yearRelase;
    }

}
