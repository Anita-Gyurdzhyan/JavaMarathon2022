package day18;

public class Task2 {
    public static void main(String[] args) {
       System.out.println(recursionSum(717771237));

        System.out.println("через рекурсию метод "+ recursionSum1(717771237));

    }
//я для себя решила циклом чтоб сравнить
    public static int recursionSum(int n){
        int a;
        int count = 0;
      while (n > 0){
          a = n % 10;
          if (a == 7){
              count++;

          }
          n = n /10;

      }
      return count;

    }

    /*через рекурсию не получается, почему когда доходит до числа 71777123, попадает в if и получает true и дальше он НЕ
    71777123 делит на 10,  а все число 717771237? И как сказать что если в if достиг true, то продолжай дальше искать?
    А то он выходит из метода

     */
    public static int recursionSum1(int n){
        int count = 0;

        if (n % 10 != 7){
          return 0;
        }

            count++;
        recursionSum1(n / 10);

            return count;
    }

}


