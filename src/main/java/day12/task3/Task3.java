package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        /*Так надо было создавать экземпляры класса?
         или вот так List<MusicBand> bandList = new ArrayList<>();
        bandList.add(new MusicBand(2018))?;
        */

        MusicBand five = new MusicBand(1996);
        MusicBand backStreetBoys = new MusicBand(1995);
        MusicBand nSync = new MusicBand(1998);
        MusicBand queen = new MusicBand(1980);
        MusicBand theBeatles = new MusicBand(1960);
        MusicBand handsUp = new MusicBand(2003);
        MusicBand serebro = new MusicBand(2009);
        MusicBand maroon5 = new MusicBand(2021);
        MusicBand linkinPark = new MusicBand(2004);
        MusicBand imagineDragons = new MusicBand(2021);
        MusicBand gorillaz = new MusicBand(2010);


        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(five);
        musicBandList.add(backStreetBoys);
        musicBandList.add(nSync);
        musicBandList.add(queen);
        musicBandList.add(theBeatles);
        musicBandList.add(handsUp);
        musicBandList.add(serebro);
        musicBandList.add(maroon5);
        musicBandList.add(linkinPark);
        musicBandList.add(imagineDragons);
        musicBandList.add(gorillaz);

        musicBandList.toString();

         //Воот так перемешивать? и как его вывести? про вывод также вопрос в методе мейн написан
        Collections.shuffle(musicBandList);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList){
        List<MusicBand> bandsAfter2000 = new ArrayList<>(Arrays.asList());
        for (int i = 0; i < musicBandList.size(); i++) {

        }

        return bandsAfter2000;
    }
}

/*
Я новый список создала внутри метода groupsAfter2000,  так верно? и вообще новый список я верно написала?
Как мне перебрать года у объектов MusicBand?

 */
