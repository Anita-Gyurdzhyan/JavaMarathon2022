package day12.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MusicBand {

     private  List<String> members;

    public MusicBand(List<String> members) {
        this.members = members;
    }

    public  void printMembers(){
        System.out.println("Печать список участников " + members );
    }

    public List<String> getMembers() {
        return members;

    }

    public  static void transferMembers(MusicBand groupA, MusicBand groupB){

        groupB.getMembers().addAll(groupA.members);
        groupA.getMembers().removeAll(groupA.members);

    }
}
/*
    1) В методе transferMembers можно сказать методом случайного перебора дошла до такой реализации. В инете метода добавления
 всех дается в таком виде :
 groupA.getMembers().addAll((Collection<? extends String>) groupB); - я попробовала так, запустила и получила ошибку
 cannot be cast to class java.util.Collection. О чем эта ошибка и такой варинт пока сложноват для базового уровня?

    2) код отрабатывает,  это верная реализация? сперва присоединяем а потом удаляем весь список из группы А?

    3) вопрос не про таску - подскажи плиз , как называется команда, которая код в idea выстраивает красиво,
    убирает лишние пробелы и т д?

    4) Чтобы автотесты отработали, надо чтобы названия методов/классов/объектов мною написанные совпадали с тем, которые указаны в автотестах?
    предположим, речь про методы которые сами придумываем, в задании не написано как он называется

 */
