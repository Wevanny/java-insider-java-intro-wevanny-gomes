package primeirosprogramas;
import java.util.*;
public class StringConvertionCTosin {
    public static void main(String[] args) {
        /*System.out.print("Número: ");
        String numberStr = read();
        int number = Integer.parseInt(numberStr);
        System.out.println("Número ao quadrado: " + (number * number));*/

        System.out.print("Número: ");
        String numberStr = read();
        double number = Double.parseDouble(numberStr);
        System.out.println("Número ao quadrado: " + (number * number));
    }

    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
