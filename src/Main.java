public class Main {

    public static void main(String[] args) {

        int balance = 300;
        int replenishment = 1100;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int total = balance + replenishment + bonus;

        System.out.println("Общая итоговая сумма на счету клиента:" + total);
        System.out.println("Бонус равен:" + bonus);


    }
}
