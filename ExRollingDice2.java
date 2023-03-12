package primeirosprogramas;

public class ExRollingDice2 {
    public static void main(String[] args) {

        double jogada = 0;
        double dado1 = Math.random() * 10;
        double dado2 = Math.random() * 10;
        dado1 = Math.floor(dado1);
        dado2 = Math.floor(dado2);

        if (dado1 < 1) {
            dado1 = 1;
        } else if (dado1 > 6) {
            dado1 = 6;
        }

        if (dado2 < 1) {
            dado2 = 1;
        } else if (dado2 > 6) {
            dado2 = 6;
        }

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);

        if (dado1 != dado2) {
            jogada = dado1 + dado2;
            System.out.println("Percorrer " + jogada + " casas");
        } else if (dado1 == dado2) {
            jogada = (dado1 + dado2) * 2;
            System.out.println("Percorrer " + jogada + " casas");
        }
    }
}
