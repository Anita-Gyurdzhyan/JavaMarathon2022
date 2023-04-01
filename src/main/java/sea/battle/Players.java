package sea.battle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Players extends GameField {

    String[][] gameField = new String[FILED_LENGTH][FILED_LENGTH];
    /*
    1 - Не знаю где создать двумерный массив игоровое поле gameField чтобы для каждого игрока был свой.
    Если сделать его объектом класса GameField и создать такой объект в классе GameField, то
    также не то потому что мне надо чтобы тип двумерного массива был String
     */

    public void enterCoordinates() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int deck4 = 1;
            /*
             2 - Конечно, более логично если палубу обозначить количеством 4, но тогда сбивается мой while.
            и я решила переменную deck у каждой палуби прописывать число, чтобы было понтянее о какой палубе речь.
            и каждой палубе делать свою переменную. Но это не очень когда речь о палубе но при этом у каждого своя переменная?

             */
            while (deck4 == 1) {

                System.out.println("Введи координаты четырех палубного корабля (формат x1,y1;x2,y2;x3,y3;x4,y4)");
                String enterFourDeckShip = scanner.nextLine();
                String regexpFour = "^\\d{1},\\d{1};\\d{1},\\d{1};\\d{1},\\d{1};\\d{1},\\d{1}$";
                /*
                3 -Регулярное выражение не дает вводить 10, возможно ли написать такое выражение чтоб соблюдался и формат и
                 то что вводим от 1 до 10 цифр?
                 */

                boolean matchesFour = Pattern.matches(regexpFour, enterFourDeckShip);

                if (!matchesFour) {
                    System.out.println("Введенные координаты не соотвествуют формату");

                } else {
                    deck4++;
                    Players.checkValidShip(enterFourDeckShip);

                    if (isCheckValidShip) {
                        Players.printField(enterFourDeckShip, gameField);
                        /*
                        4 - здесь и в последующих палубах я хочу вызывать все методы, которые написаны в классе
                        GameField.  Но так как у меня проблема с двумерным массивом , то пока не могу протетсировать
                        это именно в совокупности ввода координат. Вообще такой подход верный если точки последовательны,
                        то рисуем вокруг них ореол и печатаем игровое поле ( вызывая соответсвующие методы) ?
                         */


                    } else {
                        deck4--;

                    }
                }

            }


            int deck3 = 1;

            while (deck3 <= 3) {

                System.out.println("Введи координаты " + deck3 + "-го " + "трех палубного корабля (формат x1,y1;x2,y2;x3,y3)");
                String enterThreeDeckShip1 = scanner.nextLine();
                String regexpThree1 = "^\\d{1},\\d{1};\\d{1},\\d{1};\\d{1},\\d{1}$";

                boolean matchesThree1 = Pattern.matches(regexpThree1, enterThreeDeckShip1);

                if (!matchesThree1) {
                    System.out.println("Введенные координаты не соотвествуют формату");

                } else {
                    deck3++;
                    Players.checkValidShip(enterThreeDeckShip1);
                    if (isCheckValidShip) {
                        Players.printField(enterThreeDeckShip1, gameField);
                        Players.checkFreeSpace(enterThreeDeckShip1, gameField);

                    } else {
                        deck3--;
                    }
                }
            }


            int deck2 = 1;

            while (deck2 <= 2) {

                System.out.println("Введи координаты " + deck2 + "-го" + " двух палубного корабля (формат x1,y1;x2,y2)");
                String enterTwoDeckShip1 = scanner.nextLine();
                String regexpTwo1 = "^\\d{1},\\d{1};\\d{1},\\d{1}$";

                boolean matchesTwo1 = Pattern.matches(regexpTwo1, enterTwoDeckShip1);

                if (!matchesTwo1) {
                    System.out.println("Введенные координаты не соотвествуют формату");

                } else {
                    deck2++;
                    Players.checkValidShip(enterTwoDeckShip1);
                    if (isCheckValidShip) {

                    } else {
                        deck2--;
                    }
                }
            }

            int deck1 = 1;
            while (deck1 <= 4) {

                System.out.println("Введи координаты " + deck1 + "-го" + " одно палубного корабля (формат x1,y1)");
                String enterOneDeckShip1 = scanner.nextLine();
                String regexpOne1 = "^\\d{1},\\d{1}$";

                boolean matchesOne1 = Pattern.matches(regexpOne1, enterOneDeckShip1);

                if (!matchesOne1) {
                    System.out.println("Введенные координаты не соотвествуют формату");

                } else {
                    deck1++;
                    Players.checkValidShip(enterOneDeckShip1);
                    if (isCheckValidShip) {

                    } else {
                        deck1--;
                    }
                }

            }

            break;

        }
        scanner.close();


        }

    }
    /*
    5 - врено ли класс называть множественным числом?
     */

