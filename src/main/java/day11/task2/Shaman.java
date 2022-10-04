package day11.task2;

public class Shaman extends Hero implements Healer,MagicAttack {

    public  int magicAtt;

    public Shaman(){
        super();
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;

    }

    public void healHimself(){
        health =  health + 50;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;

        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health =  hero.health + 30;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;

        }
    }

    @Override
    public double magicalAttack(Hero hero) {
        double resultAttack = hero.magicDef * magicAtt;
        return  hero.health - resultAttack;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
