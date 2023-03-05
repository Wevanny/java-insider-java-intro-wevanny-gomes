package primeirosprogramas;

public class ExRollingDice {

    public static void main(String[] args) {
        double result = 0;
        double dice1 = Math.floor(Math.random() * 6);
        if (dice1 < 1) {
            dice1 = 1;
        }

        double dice2 = Math.floor(Math.random() * 6);
        if (dice2 < 1) {
            dice2 = 1;
        }

        if (dice1 != dice2) {
            result = dice1 + dice2;
        } else {
            result = (dice1 + dice2) * 2;
        }

        System.out.println("Dado 1: " + dice1 + " ,dado 2: " + dice2 + " e resultado: " + result);
    }
}
