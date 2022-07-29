package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public static int countPlayers = 0;
    //которое считает количество игроков на футбольном поле
    // (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал

    public Player(int i, int stamina) {
        countPlayers++;
        if (countPlayers > 6){
           countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run(int stamina) {
       return stamina--;

            //run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
            // Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
    }

        public static void info () {
            int countFree = 6 - Player.getCountPlayers(); //свободные места
            if (countPlayers < 6) {
                System.out.println("Команды неполные. На поле еще есть " + countFree + " свободных мест");
            } else {
                System.out.println("На поле нет свободных мест");
           }
        }

    }

    //Вопрос 1 - как уйти с поля? уменьшить количество игороков, то есть блока кода
// if (stamina == 0) {
//            countPlayers--; - верный?

//Вопрос 2 - не знаю как быть с методом run. Он должен на вход что то принимать? Не работает метод, что в нем сделать?

//Вопрос 3 - для чего даны константы?


