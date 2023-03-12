package primeirosprogramas;
import java.util.*;
public class KeyboardInput {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String line =  scanner.nextLine();

        System.out.println("Você digitou: " + read());
    }

    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
