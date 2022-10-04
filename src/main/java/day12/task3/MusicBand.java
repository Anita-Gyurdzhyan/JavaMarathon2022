package day12.task3;

import java.util.List;

public class MusicBand {

    private List<MusicBand> name; //Теперь поле name параметризовано классом MusicBand.
                                         // Соответственно, наш список будет хранить объекты класса MusicBand.
    private int year;


    public MusicBand( int year) {
        this.year = year;

    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name=" + name +
                '}';
    }
}

//у ArrayList в лекции было сказано что метод toString переопределен. это означает что не надо его отдельно писать?
// у меня не выводится мой список все равно в мейне
