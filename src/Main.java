public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int amount = 3250;
        int bonus;

        if (amount > 1000) {
            bonus = (amount / 100) * 1;
        } else {
            bonus = 0;
        }
        int account = (balance + amount);

        System.out.println("Бонусы: " + bonus + " рублей(я). Итоговый баланс " + account + " рублей");

    }
}
