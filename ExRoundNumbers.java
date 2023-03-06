package primeirosprogramas;
import java.util.Arrays;
public class ExRoundNumbers {
    public static void main(String[] args) {
        double [] arra = {2.0, 5.0, 5.5, 6.5};
        System.out.println(Arrays.toString(roundedNumbers(arra)));
    }

    static int[] roundedNumbers(double[] array) {
        int[] finalArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            finalArray[i] = (int) array[i];
        }
        return finalArray;
    }
}

