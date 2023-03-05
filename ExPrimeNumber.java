package primeirosprogramas;
public class ExPrimeNumber {

    public static void main(String[] args) {

        int n = 11;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(n + " é número primo!");
        } else {
            System.out.println(n + " não é número primo!");
        }
    }
}


