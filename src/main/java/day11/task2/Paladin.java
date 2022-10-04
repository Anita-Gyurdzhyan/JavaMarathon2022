package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin(){
        super();
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        health = health + 25;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;

        }
    }
    //Верно ли что методы  healHimself и healTeammate ничего не возвращают? и верно ли написан его расчет?


    @Override
    public void healTeammate(Hero hero) {

        hero.health = hero.health + 10;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;

        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}


