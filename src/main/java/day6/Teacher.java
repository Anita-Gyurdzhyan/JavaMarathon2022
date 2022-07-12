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

        String estimation = "чему то";

        switch (i){
            case 2:
            estimation = "неудовлетворительно";
            break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + s.getNameStudent() +
                " по предмету " + subject + " на оценку " + estimation);
    }
}


//Вопрос 1- переменную estimation нужно было инициилизировтаь, иначе не вывести в консоль. а почему так? нельзя просто обявить,
// а потом то что в свфиче получим пусть то и присовится?

//Вопрос - 2 - рандом работает странно - всегда первы делом выводит цифру 2,потом снова ее выводит и потом может остальные выводить.
// я не так написала или это норм?

//Вопрос 3 - в свиче более деликатно сомтрится, поэтому лучше так писать чем через if ?