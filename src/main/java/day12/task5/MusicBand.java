package day12.task5;

import java.util.List;

public class MusicBand {
    private  List<MusicArtist> members;
    //1) - Это верно что у списка тип MusicArtist? или можно было и String оставить?

    public MusicBand(List<MusicArtist> members) {
        this.members = members;
    }

    public  void printMembers(){
        System.out.println("Участники, как объекты класса MusicArtist " + members );
    }

    public List<MusicArtist> getMembers() {
        return members;
        //Получается в этом методе тип MusicArtist, то есть он ссылается на класс MusicArtist,
        // у которого должен быть переопределен tostring, чтобы могли получить участников в виде объектов. Правильно рассуждаю?
        // Ну и , конечно, то что я получаю участников, у которых тип Лист
    }

    public  static void transferMembers(MusicBand groupX, MusicBand groupY){
        groupY.getMembers().addAll(groupX.members);
        groupX.getMembers().removeAll(groupX.members);

    }
}
