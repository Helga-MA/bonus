public class Main {
    public static void main(String[] args) {

        int account = 1500;
        int replenish = 2000;
        boolean bonus = true;

        int present;
        if (bonus) {
            present = replenish / 1000;
        } else {
            present = 0;
        }
        int result = account + replenish + present;
        System.out.println("Баланс: " + result);
        System.out.println("Бонус: " + present);

    }
}

