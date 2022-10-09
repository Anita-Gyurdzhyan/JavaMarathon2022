package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        //---- можно слово Array опутить и писать просто List<MusicBand> bands = new ArrayList<>(); ?

        MusicBand five = new MusicBand("five", 1996);
        // -----Я в первом коммите создавала так экземпляры класса :
        //  MusicBand five = new MusicBand(1996); - но надо с именем в аргументах чтобы выводить их название?

        MusicBand backStreetBoys = new MusicBand("backStreetBoys", 1995);
        MusicBand nSync = new MusicBand("nSync", 1998);
        MusicBand queen = new MusicBand("queen", 1980);
        MusicBand theBeatles = new MusicBand("theBeatles", 1960);
        MusicBand handsUp = new MusicBand("handsUp", 2003);
        MusicBand serebro = new MusicBand("serebro", 2009);
        MusicBand maroon5 = new MusicBand("maroon5", 2021);
        MusicBand linkinPark = new MusicBand("linkinPark", 2004);
        MusicBand imagineDragons = new MusicBand("imagineDragons", 2021);
        MusicBand gorillaz = new MusicBand("gorillaz", 2010);


        bands.add(five);
        bands.add(backStreetBoys);
        bands.add(nSync);
        bands.add(queen);
        bands.add(theBeatles);
        bands.add(handsUp);
        bands.add(serebro);
        bands.add(maroon5);
        bands.add(linkinPark);
        bands.add(imagineDragons);
        bands.add(gorillaz);

        System.out.println(bands);

        Collections.shuffle(bands);
        System.out.println(bands);

        groupsAfter2000(bands);
        /* Методы, которые сами придумываем их пишут в формтае - Метод(вызываемый объект).
        А те методы, которые встроены в джаве, то пишем через формат Объект. точка? например bands.add

         */
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        //---- А так можно писать без указания типа данных Листа? То есть почему в bands2 не надо указывать <MusicBand>?
        List bands2 = new ArrayList<>();

        for (int i = 0; i < bands.size(); i++) {

            //  ---выводить в отдельную переменную или в данном случае можно оставлять магическое число 2000?
            int year = 2000;

            if (bands.get(i).getYear() > year) {
                bands2.add(bands.get(i));

            }
        }
        System.out.println("вторая группа" + bands2);
        return bands2;
    }
}






