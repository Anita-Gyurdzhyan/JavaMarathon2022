package day7;
//В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
// принимает два объекта класса Airplane (два самолета)
// и выводит сообщение в консоль о том, какой из самолетов длиннее.

public class Task1 {
    public static void main(String[] args) {
        Airplane s7 = new Airplane("Jonsons", 2019,14, 3500);
        Airplane aeroflot = new Airplane("RusTeam", 2022, 9, 480.25);


        Airplane.compareAirplanes(s7, aeroflot);


    }
}