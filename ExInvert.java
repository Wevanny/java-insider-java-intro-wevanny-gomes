package primeirosprogramas;
public class ExInvert {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sizeArray = array.length;
        int[] invertedArray = new int[sizeArray];
        int reducedSizeArray = sizeArray - 1;

        for (int i = 0; i < sizeArray; i++) {
            invertedArray[i] = array[reducedSizeArray - i];
            System.out.print(invertedArray[i] + " ");
        }

    }
}
