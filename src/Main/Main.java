package Main;

public class Main {
    public static void main(String[] args) {

        int begin = 100;

        int x = 100;

        int y = 1100;

        int bonus = 0;

        if (y >= 1000) {
            bonus = y / 100;
        }

        System.out.println("сумма пополнения " + y + ", бонус " + bonus);

        bonus = 0;
        if (x >= 1000) {
            bonus = x / 100;
        }
        System.out.println("сумма пополнения " + x + ", бонус " + bonus);
    }



}
