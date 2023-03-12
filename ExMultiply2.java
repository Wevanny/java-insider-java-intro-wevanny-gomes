package primeirosprogramas;
import java.util.Arrays;
public class ExMultiply2 {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        int m = 3;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * m;
        }

        System.out.println(Arrays.toString(array));
    }
}
