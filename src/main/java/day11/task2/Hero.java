package day11.task2;

public abstract class Hero {
    double health;

    static final double MIN_HEALTH = 0;
         static final  double MAX_HEALTH = 100;

        int physAtt;
        double physDef;
        double magicDef;

        public Hero(){
             health = 100;

            /*Вопрос 1  - лучше в конструткоре Hero писать чему равно здоровье или отдельно  в поле написать что,
            double health = 100?
            Вопрос 2  - если конструктор Hero на вход ничего не принимает, что такое выражение
            в нем this.health = health; - уже бессмыленно?*/
        }

//Вопрос 3 - Надо было метод physicalAttack делать абстрактным? или если абстрактны мтеод , то у него
// не должно быть реализации?
    public double physicalAttack(Hero hero) {
        double resultAttack = hero.physDef * physAtt;
        return  hero.health = hero.health - resultAttack;
    }

}

/*
_____
    Вопрос 4 - метод physicalAttack. я нигде не создавала объект класса HERO, как так получилось что написанное  hero он распознает что это и
    дает у него оращаться к полю physDef? Это как называется, чтобы прочитать про это

    у метода physicalAttack верный расчет?

 */