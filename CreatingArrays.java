package primeirosprogramas;
import java.util.Arrays;
public class CreatingArrays {

    public static void main(String[] args) {

        int[] array1 = {-1, 0, 4, 10};
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);

        String[] array2 = new String[3];
        array2[1] = "abc";
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);
    }
}
