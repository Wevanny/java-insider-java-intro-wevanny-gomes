package primeirosprogramas;

public class ExEvenOrOdd {
    public static void main(String[] args) {
        int number = 4;
        String answer = "Par";

        if (number % 2 == 0) {
            answer = "Número par!";
        } else {
            answer = "Número ímpar!";
        }

        System.out.println(answer);
    }
}
