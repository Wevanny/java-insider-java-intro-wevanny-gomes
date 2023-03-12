package primeirosprogramas;

public class ExOperations {
    public static void main(String[] args) {

        double result = numbersOperation(2, 2, "/");
        System.out.println("O resultado é " + result);

    }

    static double numbersOperation (double n1, double n2, String operation) {

        double result = 0;
        if (operation.equals("+")) {
            result = n1 + n2;
        } else if (operation.equals("-")) {
            result = n1 - n2;
        } else if (operation.equals("*")) {
            result = n1 * n2;
        } else if (operation.equals("/")) {
            result = n1 / n2;
        }
        return result;
    }
}
