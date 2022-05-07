//// Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
//// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.

package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {

                matrice[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + ", ");
            }
            System.out.println();
        }

        int sumMax = 0;
        int index = 0;
        for (int i = 0; i < matrice.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrice[i].length; j++) {


                sum += matrice[i][j];

            }
            if (sum > sumMax) {
                sumMax = sum;
                index = i;
            }


            System.out.println("результат максимальной суммы строки: " + sumMax);
            System.out.println(index);
        }
    }
}

