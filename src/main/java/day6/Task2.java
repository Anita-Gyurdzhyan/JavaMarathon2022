package day6;

//Создать конструктор в классе Самолет, принимающий
// в качестве аргументов значения четырех полей класса (значение поля “количество топлива в баке” установить равным 0).
//Создать новый объект класса Самолет с произвольными данными.
//Изменить год выпуска и длину с помощью сеттеров,
// вызвать метод fillUp(int n) два раза, передав разные значения. Вызвать метод info().

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("S7", 2014, 55, 87.47);
        airplane.setYear(2019);
        airplane.setLength(134.5);
        airplane.fillUp(7);
        airplane.info();

        airplane.fillUp(4);
        airplane.info();
    }
}

