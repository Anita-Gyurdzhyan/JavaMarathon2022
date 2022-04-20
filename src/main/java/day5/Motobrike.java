//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

package day5;

public class Motobrike {
    private String model;
    private String color;
    private int yearRelase;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearRelase(int yearRelase) {
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
        System.out.println("Из класса Мотоцикл " + model + "," + color + "," + yearRelase);
    }
}


