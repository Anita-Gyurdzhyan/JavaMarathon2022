package day6;

//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и
// возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motobrike motobrike = new Motobrike("Harley Davidson","red", 2020 );
        motobrike.info();
        int resultMoto = motobrike.yearDifference(2010);
        motobrike.getInfo();
        System.out.println("Что вернул метод у Мотоцикла = " + resultMoto);

        car.info();
        car.setModel("Audi");
        car.setColor("white");
        car.setYearRelase(2019);
        car.getInfo();
        int resultCar = car.yearDifference(1993);

        System.out.println("Что вернул метод yearDifference у Авто = " + resultCar);

    }
}
