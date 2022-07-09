public class Main {
    public static void main(String[] args) {

        int startingAccount = 100; // сумма на счету до пополнения
        int payment = 1100; // сумма пополнения счета

        int bonus; // сумма бонуса
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = startingAccount + payment + bonus; // сумма на счету после пополнения
        System.out.println("Сумма бонуса: " + bonus);
        System.out.println("Сумма на счету после пополнения: " + finalAccount);
    }
}