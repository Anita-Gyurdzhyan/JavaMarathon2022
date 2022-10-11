package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> membersA = new ArrayList<>();
        List<String> membersB = new ArrayList<>();

        MusicBand groupA = new MusicBand(membersA);
        MusicBand groupB = new MusicBand(membersB);

      membersA.add("Vera Voronina");
      membersA.add("Polona Gagarina");

      membersB.add("Stepa Niko");

        System.out.println(groupA.getMembers());
        System.out.println(groupB.getMembers());

       groupA.printMembers();
    }

}

/*
После того , как добавила второй список (membersB), он выводит список участников непонятно.
Выводит одинаковые состав участников,  что в groupA, что в groupB. Почему так?

 */
