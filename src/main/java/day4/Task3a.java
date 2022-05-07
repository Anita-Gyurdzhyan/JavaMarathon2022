// Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.

package day4;

import java.util.Random;

public class Task3a {
    public static void main(String[] args) {
        int[][] matrice = new int[3][2];
        int min = 0;
        int max = 50;
        int diff = max - min;

        int sumMax = 0;
        int sumMax1 = 0;
        int sumMax2 = 0;
        int sumMax3 = 0;
        int sumMax4 = 0;
        int sumMax5 = 0;
        int sumMax6 = 0;
        int sunMax7;
        int sumMax8;
        int sumMax9;
        int sumMax10;
        int sumMax11;
        int sumMax12;
        int index = 0;
        int resultSum = 0; // сюда помещать бОльшую по велечине из сумм

        Random random = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {

                matrice[i][j] = random.nextInt(diff + 1) + min;
            }
        }
        // System.out.println(Arrays.deepToString(matrice).replace(", ", "]\n"));

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {

                    if (i == 0){
                        sumMax += matrice[i][j];
                        resultSum = sumMax;

                   }
                    if (i == 1) {
                        sumMax1 += matrice[i][j];
                        if (sumMax1 > sumMax) {
                            resultSum = sumMax1;
                            index = i;
                        }
                    }

                        if (i == 2){
                           sumMax2 += matrice[i][j];
                        if (sumMax2 > sumMax1 & sumMax2 > sumMax) {
                            resultSum = sumMax2;
                            index = i;
                        }
                    }
            }
        }
       // System.out.println("результат максимальной суммы строки: " + resultSum);
        System.out.println("Индекс строки " + index);
    }
}

// если так верно, то есть хранить суммы каждой строки в отдельную переменную,
// тогда я подумаю как индекс последней из них вытаскивать