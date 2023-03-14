package primeirosprogramas;
import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner receive = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String phrase = receive.nextLine();
        String inverted = " ";

        for (int i = phrase.length() - 1; i >= 0; i--) {
            inverted = inverted + Character.toString(phrase.charAt(i));
        }
        System.out.println(inverted);
    }
}
