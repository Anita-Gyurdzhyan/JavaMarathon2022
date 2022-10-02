package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    double health;

    public Warrior() {
        super();
        this.physAtt = 30;
        this.physDef = 0.8;
        this.magicDef = 0;

    }

    @Override
    public double physicalAttack(Hero hero) {
        double resultAttack = physDef * physAtt;
        return health = Hero.MAX_HEALTH - resultAttack;

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
/*
Надо писать в конструткоре this  и super?
 */