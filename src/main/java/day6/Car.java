
package day6;

public class Car {
    private String model;
     private String color;
     private int yearRelase;

     public void setModel(String model){
          this.model = model;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public void setYearRelase(int yearRelase){
          this.yearRelase = yearRelase;
     }

     public String getModel() {
          return model;
     }

     public String getColor() {
          return color;
     }

     public int getYearRelase() {
          return yearRelase;
     }

     public void getInfo(){
          System.out.println("Из класса авто " + model + "," +color + "," + yearRelase );
     }
     public void info(){
         System.out.println("Это автомобиль");
     }
    public int yearDifference(int inputYear){
         return Math.abs(inputYear - yearRelase);
    }
}
