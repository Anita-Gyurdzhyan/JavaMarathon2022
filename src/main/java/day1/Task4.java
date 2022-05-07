//Используя цикл while, выведите в столбик строки вида “Олимпиада year года”, где year - это число, которое принимает
// значения,начиная от 1980 до 2020, с шагом увеличения равным 4.

package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020){
            System.out.println("Олимпиада " + year + " года");
            year +=4;
        }

    }
}
