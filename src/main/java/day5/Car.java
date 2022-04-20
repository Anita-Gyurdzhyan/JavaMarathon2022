// Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

package day5;

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
}
