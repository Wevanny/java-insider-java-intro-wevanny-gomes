package primeirosprogramas;

public class ExSumNumbers {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("A soma é: " + sum);
    }
}
