package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"),
    ROOK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"),
    KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),

    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"),
    ROOK_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟");


    private double value;
    private String designation;




    ChessPiece(double value, String designation){
         this.value = value;
         this.designation = designation;

    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return  designation  ;
    }
}

/*

1. Создайте Enum “Шахматная фигура” (англ. ChessPiece).
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook),
слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
Ценность фигуры - вещественное число
Строковое обозначение фигуры

В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее

У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

 */