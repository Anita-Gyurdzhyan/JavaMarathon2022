package day12.task5;

public class MusicArtist {

    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

/*
    1) Основная суть изменения в этой таске только в том, что раз участники списка теперь объекты, переопределить
  у их класса (MusicArtist) метод toString() ?
 */