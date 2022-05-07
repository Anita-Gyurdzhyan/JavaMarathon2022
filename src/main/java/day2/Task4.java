package day2;
// не поняла когда же он попадет в условие y = 420 или я неврено написала или тут нет логики?
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = scanner.nextDouble();

        double y;

        if (x >= 5) {
            y = (Math.pow(x, 2)) / (x + 7);
            System.out.println(y);

        } else if (-3 < x && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(y);

        } else {
            y = 420;
        }

    }
}
