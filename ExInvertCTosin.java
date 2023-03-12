package primeirosprogramas;
import java.util.Arrays;
public class ExInvertCTosin {

    public static void main(String[] args) {

        String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] b = new String[a.length];

        /*for (int i = a.length - 1; i >= 0; i--) {
            b[a.length - 1 - i] = a[i];
        }*/

        for (int i = 0; i < a.length; i++) {
            for (int j = b.length - 1; j >= 0; j--) {
                b[j] = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
