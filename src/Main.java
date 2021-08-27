public class Main {
    public static void main(String[] args) {

        int account = 1000;
        int replenish = 2000;
        int bonus;

        if (replenish >= 1000) {
            bonus = replenish / 1000;
        } else {
            bonus = 0;
        }
        int result = account + replenish + bonus;
        System.out.println("Баланс: " + result);
        System.out.println("Бонус: " + bonus);

    }
}

