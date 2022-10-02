package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    public  int magicAtt;

    public Shaman(){

        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;

    }

    public int healHimself(){
        return 50;
    }

    @Override
    public int healTeammate(Hero hero) {
        return 30;
    }


    @Override
    public double physicalAttack(Hero hero) {
        return 0; // я просто написала 0, пока в классе Warrior только написала как я думаю реализацию

    }

    @Override
    public double magicalAttack(Hero hero) {
        return 0; //я просто написала 0, пока в классе Warrior только написала как я думаю реализацию

    }

}
