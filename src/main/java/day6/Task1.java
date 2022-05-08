package day6;

//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и
// возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motobrike motobrike = new Motobrike();

        car.setYearRelase(2019);
        car.yearDifference(2022);
        car.info();
    }
}
