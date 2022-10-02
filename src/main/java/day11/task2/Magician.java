package day11.task2;

public class Magician extends Hero implements  PhysAttack, MagicAttack{

    public  int magicAtt;// (величина магической атаки)

    public Magician(){

        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 0.8;

    }

    @Override
    public double magicalAttack(Hero hero) {
        return 0; //я просто написала 0, пока в классе Warrior только написала как я думаю реализацию

    }

    @Override
    public double physicalAttack(Hero hero) {

        return 0;
    }



}
