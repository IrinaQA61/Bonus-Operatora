// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int startingbalance = 100;
        int bonusScale = 100;
        int account_topped_up = 2000;
        int bonus;

        if (account_topped_up >= 1000) {
            bonus = account_topped_up / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = startingbalance + account_topped_up + bonus;

        System.out.println("Вы пополнили счёт на " + account_topped_up + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
    }
}