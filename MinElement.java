package primeirosprogramas;
import java.util.Arrays;
public class MinElement {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4};
        findMinElement(arr);

    }

    static void findMinElement(int[] array) {

        //int[] array = {3, 5 ,9 ,12 ,2};
        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minElement ) {
                minElement = array[i];
            }
        }
        System.out.println(minElement);
    }
}
