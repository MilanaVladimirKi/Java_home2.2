package Main;

public class Main {
    public static void main(String[] args) {
        int begin = 100;
        int amount = 1100;
        int bonus;

        if (amount >= 1000) {
            bonus = amount / 100;
        } else
            bonus = 0;

        int result = begin + amount + bonus;
        if (bonus > 0) {
            System.out.println("сумма пополнения " + amount + ", бонус " + bonus + ", итоговая сумма " + result);
        } else {
            System.out.println("сумма пополнения " + amount + ", итоговая сумма " + result);
        }
    }

}