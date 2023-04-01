package sea.battle;

public class GameField {
    static final int FILED_LENGTH = 10;
    static boolean isCheckValidShip = true;
    static boolean isCheckFreeSpace = true;
    static final String CELL_SHIP = "\uD83D\uDEE5";
    static final String FREE_CELLS = "⬜";
    static final String HALO_SHIPS = "\uD83D\uDFE6 ";
    static final int COUNTCOORDINATES = 2;
    static boolean isVertical = true;


    /*
     1 - Я вынесла в отдельный метод(parseStringInArray) парсинга координат строки в массив, так как
     он используется во всех моих методах. Но метод, например,checkValidShip - завязан на одномерном массиве,
     который получаем из координат,и не получается сократить код.
     Как можно исправить? Предполагаю, что  в методах ниже надо
   проходится по двумерному массиву в циклах ( игровое поле), а я везде прохожусь по одномуреному массиву координат

     */

//метод превращения координат в массив
    public static int[] parseStringInArray(String enterShip) {
        String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }
        return numShipArr;
    }

    //Проверка на последовательность точек корабля
    public static boolean checkValidShip(String enterShip) {

           String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }


        for (int i = 2; i < numShipArr.length; i = i + 2) {
            /*
            2 - В массиве я вынужденно иду с i = 2, чтобы не получить исключение превышение размера массива.
            Этот вариант не очень или как вообще не выходить за пределы размера массива?
             */
            if (numShipArr[0] == numShipArr[i] && numShipArr[i - 1] == numShipArr[i + 1] - 1
                    || numShipArr[1] == numShipArr[i + 1] && numShipArr[i - 2] == numShipArr[i] - 1) {
                isCheckValidShip = true;

            } else {
                System.out.println("Не валидный корабль. Точки должны быть последовательными");
                isCheckValidShip = false;
                break;
            }
        }

        return isCheckValidShip;
    }

    //Вывод игрового поля на экран
    public static void printField(String enterShip, String[][] gameField) {
        String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }

        for (int i = 2; i <= numShipArr.length; i = i + 2) {
            int x = numShipArr[i - 2];
            int y = numShipArr[i - 1];
            gameField[x - 1][y - 1] = CELL_SHIP;
            /*
            3 -  пишу -1 так как отсчет в массиве с 0 идет. Но конечно такой подход сбивает с толку.
            Такую концепцию и использую в методе растановки ореола (haloShips). Есть иной подход чтобы писать
              gameField[x][y] = CELL_SHIP ?
             */

        }

        //печатаю двумерный массив
        for (int j = 0; j < gameField.length; j++) {
            for (int k = 0; k < gameField[j].length; k++) {
                System.out.print(gameField[j][k] + " ");

            }
            System.out.println();

        }

    }

    //Проверка расположение кораблей на свободное место
    public static boolean checkFreeSpace(String enterShip, String[][] gameField) {
        String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }

        for (int i = 2; i <= numShipArr.length; i = i + 2) {
            int x = numShipArr[i - 2];
            int y = numShipArr[i - 1];
            if (gameField[x - 1][y - 1].equals(CELL_SHIP)) { //-1 так как массив с 0 отсчет
                System.out.println("На координате уже расположен корабль. Необходимо ввести координаты свободных мест");
                isCheckFreeSpace = false;
                break;

            } else {
                isCheckFreeSpace = true;
            }
        }
        return isCheckFreeSpace;
    }

    //Вертикальный или горизонтальный корабль
    public static boolean vertical(String enterShip) {
        String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }

        for (int i = 2; i < numShipArr.length; i = i + 2) {
            int x = numShipArr[i - 2];
            if (numShipArr[0] == x) {
                isVertical = true;
            } else isVertical = false;

        }

        return isVertical;
        /*
        4 - Если написать этот код отдельно, не обворачивая в метод, то он верно считает , что есть горизонатльный
        а что вертикальный корабль и верно рисует ореол. Но когда я вызываю переменную isVertical  в методе
        haloShips -то совсем по другому рисует. Не знаю в чем дело
         */

    }


    //рисую ореол
    public static void haloShips(String enterShip, String[][] gameField) {
        String chReplace = enterShip.replaceAll(",", " ").replaceAll(";", " ");
        String[] shipArray = chReplace.split(" ");
        int[] numShipArr = new int[shipArray.length];

        for (int i = 0; i < numShipArr.length; i++) {
            numShipArr[i] = Integer.parseInt(shipArray[i]);
        }
           /*
              5 - В методе рисования ореола у меня верно расписана структура по вертикали и горизонтали?
              И как проверить границы ?
     */

        for (int i = 2; i <= numShipArr.length; i = i + 2) {
            int x = numShipArr[i - 2];
            int y = numShipArr[i - 1];
            if (isVertical) {
                //проверяю  кончик слева
                if (gameField[x - 1][y - 2].equals(FREE_CELLS)) {
                    gameField[x - 1][y - 2] = HALO_SHIPS;
                }
                //проверяю кончик справа
                if (gameField[x - 1][y].equals(FREE_CELLS)) {
                    gameField[x - 1][y] = HALO_SHIPS;
                }

                //проверяю верхушку по горизонтали
                if (gameField[x - 2][y - 1].equals(FREE_CELLS)) {
                    gameField[x - 2][y - 1] = HALO_SHIPS;
                }
                //проверяю низ по горизонтали
                if (gameField[x][y - 1].equals(FREE_CELLS)) {
                    gameField[x][y - 1] = HALO_SHIPS;
                }

            } else { //Значит корабль горизонтальный
                //проверяю  весь левый кончик
                if (gameField[x - 1][y - 2].equals(FREE_CELLS)) {
                    gameField[x - 1][y - 2] = HALO_SHIPS;

                    //проверяю  весь кончик справа
                }
                if (gameField[x - 1][y].equals(FREE_CELLS)) {
                    gameField[x - 1][y] = HALO_SHIPS;
                }

                //проверяю верхушку по горизонтали
                if (gameField[x - 2][y - 1].equals(FREE_CELLS)) {
                    gameField[x - 2][y - 1] = HALO_SHIPS;
                }
                if (gameField[x - 2][y - 2].equals(FREE_CELLS)) {
                    gameField[x - 2][y - 2] = HALO_SHIPS;
                }
                if (gameField[x - 2][y].equals(FREE_CELLS)) {
                    gameField[x - 2][y] = HALO_SHIPS;
                }
                //проверяю низ
                if (gameField[x][y - 1].equals(FREE_CELLS)) {
                    gameField[x][y - 1] = HALO_SHIPS;
                }
                if (gameField[x][y - 2].equals(FREE_CELLS)) {
                    gameField[x][y - 2] = HALO_SHIPS;
                }
                if (gameField[x][y].equals(FREE_CELLS)) {
                    gameField[x][y] = HALO_SHIPS;
                }

            }

        }

    }

}