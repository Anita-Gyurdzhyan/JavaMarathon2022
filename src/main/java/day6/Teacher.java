package day6;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public void evaluate(Student s){ // принимает в качестве аргумента студента
      int i = (int) ((Math.random() *4) + 2);
        System.out.println("счетчик " + i);

      if (i == 2){
          System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + s.getNameStudent() +
                  " по предмету " + subject + " на оценку " + "неудовлетворительно");
      }else if (i ==3){
          System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + s.getNameStudent() +
                  " по предмету " + subject + " на оценку " + "удовлетворительно");
      }else if (i ==4){
          System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + s.getNameStudent() +
                  " по предмету " + subject + " на оценку " + "хорошо");
      }else if (i == 5){
          System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + s.getNameStudent() +
                  " по предмету " + subject + " на оценку " + "отлично");
      }

    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSubject() {
        return subject;
    }

   // public void setSubject(String subject) {
       // this.subject = subject;
    //}


}
//Вопрос 1- так как в классе Преподаватель создается метод оценки, то нет необходимости создавать методы setSubject, getSubject,
//setNameTeacher и getNameTeacher ? то что мы в этом классе обращаемся напрямую к полям nameTeacher и subject - это норм или надо
//через сеттеры и геттер?

//Вопрос 2 - я не поняла в чем плюсы метода evaluate, а точнее статьи Объекты как параметры методов.Чтобы не дублировать одинаковые методы
// в разных классах, а с таким подходом мы можем в через мтеод обращаться к объекту другого класа?