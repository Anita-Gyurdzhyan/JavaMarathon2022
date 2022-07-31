package day7;

public class Player {
    private int stamina;

    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;

    public static int countPlayers = 0;

    public Player(int i) {
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

    public void run() {
         stamina--;
        if (stamina == 0) {
          countPlayers--;
          stamina = Player.MIN_STAMINA;
        }
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

    //Вопрос 1 - метод run переделала, но чтобы он не уменшал количество игроков при выносливости 0, надо переменную придумать
//и сделать по аналогии с блоком кода  stamina = Player.MIN_STAMINA; ?


