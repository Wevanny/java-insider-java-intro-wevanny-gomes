package primeirosprogramas;
import java.util.*;

public class ExOperationsCTosin {
    public static void main(String[] args) {

        System.out.println(("Número 1:"));
        double n1 = Double.parseDouble(read());
        System.out.println(("Número 2:"));
        double n2 = Double.parseDouble(read());

        System.out.println("Operação: ");
        String op = read();

        double result;
        if(op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")){
            result = n1 - n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        } else if (op.equals("/")) {
            result = n1 / n2;
        } else {
            System.out.println("Operador inválido!");
            result = 0;
        }
        System.out.println("O resultado é: " + result);

    }
    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
