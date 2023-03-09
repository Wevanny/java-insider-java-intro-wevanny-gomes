package primeirosprogramas;
import java.util.Arrays;

public class ExInvert2 {
    public static void main(String[] args) {

            String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
            String[] b = new String[a.length];
            int cont = 0;
            int aux = 1;
            boolean process = true;

            while (process) {
                //for (int i = 0; i < b.length; i++) { //O Tadeu mostrou assim mas também funciona com o a.length e
                // eu achei mais didático.
                for (int i = 0; i < a.length; i++) {
                    if (i == a.length - aux){
                        b[cont] = a[i];
                        cont++;
                        aux++;
                    }
                    if (cont == b.length) {
                        process = false;
                    }
                }
            }
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));


    }
}
