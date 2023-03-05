package primeirosprogramas;
import java.util.Arrays;
public class ExMultiply {

    public static void main(String[] args) {

        double[] array = {0.5, 1.5, 3.0, 2.2};

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 3;
        }
        System.out.println(Arrays.toString(array));
    }
}
