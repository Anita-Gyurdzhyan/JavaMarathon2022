package day9.Task2;

public class Circle extends Figure{
    private double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return (Math.PI * (Math.pow(circleRadius, 2)));
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * circleRadius);
    }

}
/**
 * S это поле класса. То, что там записано что-то, не значит что этот расчет был запущен и в поле лежит результат.
 * По умолчанию при создании объекта поле инициализируется нулем (ты его и видишь).
 * Если тебе хочется что бы там был не ноль, тогда в конструктор перенеси инициализацию.
 *
 * public class Circle extends Figure {
 *     private  double circleRadius;
 *     double S;
 *
 *     public Circle(double circleRadius, String color) {
 *         super(color);
 *         this.circleRadius = circleRadius;
 *         S = (Math.PI * (Math.pow(circleRadius, 2)));
 *     }
 *
 *     @Override
 *     public double area() {
 *         return S;
 *     }
 */
