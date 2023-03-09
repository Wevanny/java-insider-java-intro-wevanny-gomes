package primeirosprogramas;
import java.util.Arrays;
public class CreatingArrays {

    public static void main(String[] args) {

        int[] array = {-1, 0, 4, 10};
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        System.out.println("");

        String[] outroArray = new String[3];
        outroArray[1] = "abc";
        System.out.println(outroArray);
        System.out.println(Arrays.toString(outroArray));
        System.out.println(outroArray.length);
    }
}
