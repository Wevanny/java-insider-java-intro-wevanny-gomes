package primeirosprogramas;
import java.util.Arrays;
public class ExRemoveElement2 {
    public static void main(String[] args) {

        //String[] array = {"PHP", "Java", "Python", "Java", "PHP", "Java"};
        //String[] array = {"PHP", "Python", "Java", "Java", "Java"};
        String[] array = {"Java", "Java", "Java", "PHP", "PHP"};
        System.out.println(Arrays.toString(array));

        String remove = "Java";
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (array[i] == remove) {
                for (int j = i + 1; j < length; j++) {
                    array[j - 1] = array[j];
                }

                array[length - 1] = "vazio";
                length--;
            }
        }

        System.out.println(Arrays.toString(array));

        /*//String[] array = {"PHP", "Java", "Python", "Java", "PHP", "Java"};
        //String[] array = {"PHP", "Python", "Java", "Java", "Java"};
        String[] array = {"Java", "Java", "Java", "PHP", "PHP"};
        System.out.println(Arrays.toString(array));

        String remove = "Java";
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (array[i] == remove) {
                array[i] = "vazio";
            }
        }

        System.out.println(Arrays.toString(array));*/
    }
}
