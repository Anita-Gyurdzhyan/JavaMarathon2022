package day17;


import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPieces = ChessPiece.values();
        /* 1 - Я все-таки создала список чтоб в него добавлять нужные элементы, хоть ты и ответил в чате что надо просто вывести
        а как без списка делать?
         */

        List<ChessPiece> chessPieceList = new ArrayList<>();
        int count = 0;

        for (ChessPiece chessPiece : chessPieces) {

            if (chessPiece.getDesignation() == "♙" | chessPiece.getDesignation() == "♜") {
                    /*3 - почему idea подчеркивает мне делать через иквелс? скрин тут https://pastenow.ru/JK0RG.
                    Enumы же сравнивают по ссылке*/

                chessPieceList.add(chessPiece); // Как несколько раз добавлять один и тот же эелемент в список?
            }
        }
        System.out.println(chessPieceList);


        /*
        3 - Тут я написала второе решение с применением while. я не знаю как вывести подряд одну и ту же фигуру.
        Почему count ==4 - всегда false? я же прибавляю количество, когда в if()е что то нахожу
         */


        while (count ==4) {

            for (int i = 0; i < ChessPiece.values().length; i++) {

                    if (ChessPiece.values()[i] == ChessPiece.valueOf("PAWN_WHITE")) {
                        count++;
                        System.out.println("из второго варианта" + ChessPiece.values()[i]);
                    }
            }

        }

    }
}



