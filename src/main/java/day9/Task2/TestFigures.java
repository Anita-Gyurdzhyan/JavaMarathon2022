package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20, 30, "green");

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 10, 10, null),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Сумма периметров красных фигур " + TestFigures.calculateRedPerimeterfor(figures));
        System.out.println("Сумма площадей красных фигур " + TestFigures.calculateRedArea(figures));

        for (int i = 0; i < figures.length; i++) {
            if (i == 1) {
                System.out.println(figures[1].getColor());
            }

        }
    }

        public static double calculateRedPerimeterfor (Figure[]figures){
            double sumPerRed = 0;

            for (int i = 0; i < figures.length; i++) {
                //if (figures[i].getColor().equals("Red")){

                if ("Red".equals(figures[i].getColor())) {
                    sumPerRed += figures[i].perimeter();
                }
            }
            return sumPerRed;

        }


        public static double calculateRedArea (Figure[]figures){
            double sumAreaRed = 0;

            for (int i = 0; i < figures.length; i++) {

                if ("Red".equals(figures[i].getColor())){
                //if (figures[i].getColor() == "Red") {
                    sumAreaRed += figures[i].area();
                }

            }
            return sumAreaRed;
        }
    }




//Все ли корреткно в моем решении?*/