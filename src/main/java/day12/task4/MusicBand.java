package day12.task4;

import java.util.List;

public class MusicBand {

    private static List<String> members;

    public MusicBand(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB){

        /* Я нашла такой пример в инете с addAll. Мне в этом методе тогда как использовать имена моих списков
         membersA membersB из мейна в этом классе?

        List listSource = new ArrayList();
    listSource.add("123");
    listSource.add("456");
    List listDest   = new ArrayList();
    listDest.addAll(listSource);
Этот пример добавляет все элементы из listSource в listDest.
         */
    }

    // Вопрос 2 - Когда метод printMembers я писала static, он в мейне не вызывался так  groupA.printMembers();
    // Потому что static относился конкретно к классу MusicBand, и убрав static он стал принадлежать и в незоны класса MusicBand?

    public  void printMembers(){
        System.out.println("Печать список участников " + MusicBand.members );
    }


    public List<String> getMembers() {
        return members;

        //Этот метод сделала тип данных список. Так верно? И вообще при создании метода как размышлять,
        // надо Void делать или с return ? На что опираться при выборе?
    }

}
