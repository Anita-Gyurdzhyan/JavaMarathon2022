package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{

    double health;

    public Paladin(){
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;

    }

    @Override
    public int healHimself() {
        return 25;
    }

    @Override
    public int healTeammate(Hero hero) {
        return 10;
    }


    @Override
    public double physicalAttack(Hero hero) {
         health =  (physAtt * physDef);
        return health;

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}


