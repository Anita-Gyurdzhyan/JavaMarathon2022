package day12.task4;


import java.util.ArrayList;
import java.util.Collections;
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

       groupA.printMembers();
       groupB.printMembers();

       MusicBand.transferMembers(groupA, groupB);
        System.out.println("Вызвали метод перехода");

       groupA.printMembers();
       groupB.printMembers();
    }

}

