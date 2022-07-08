package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Ani");
        Teacher teacher = new Teacher("Olga Pavlovna", "english");
        teacher.evaluate(student);
    }
}
