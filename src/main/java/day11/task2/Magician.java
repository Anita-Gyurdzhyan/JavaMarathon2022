package day11.task2;

public class Magician extends Hero implements MagicAttack{

    public  int magicAtt;

    public Magician(){
        super();
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 0.8;

    }

    @Override
    public double magicalAttack(Hero hero) {
        double resultAttack = hero.magicDef * magicAtt;
        return  hero.health - resultAttack;

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
