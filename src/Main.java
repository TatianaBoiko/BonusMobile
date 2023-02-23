public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс первоначальный
        int replenishment = 1000; //пополнение

        int bonus;
        if (replenishment < 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }
        balance = balance + replenishment + bonus;

        System.out.println("количество бонусов"+bonus);
        System.out.println("итоговый баланс"+balance);
    }
}