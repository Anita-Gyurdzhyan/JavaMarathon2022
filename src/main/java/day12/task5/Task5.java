package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Ani", 25); // участники
        MusicArtist musicArtist2 = new MusicArtist("Lev", 43);
        MusicArtist musicArtist3 = new MusicArtist("Pavel", 18);

        List<MusicArtist> artistListX = new ArrayList<>(); //список участников
        List<MusicArtist> artistListY = new ArrayList<>();

       MusicBand groupX = new MusicBand(artistListX); // музыкальная группа
       MusicBand groupY = new MusicBand(artistListY);

       artistListX.add(musicArtist1);
       artistListY.add(musicArtist2);
       artistListY.add(musicArtist3);

       groupX.printMembers();
       groupY.printMembers();

       MusicBand.transferMembers(groupX, groupY);
        System.out.println("После слияния групп");
        groupY.printMembers();
        groupX.printMembers();

    }
}
