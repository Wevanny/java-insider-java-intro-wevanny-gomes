package primeirosprogramas;

public class MinElementCarlos {

    public static void main(String[] args) {

        System.out.println("Início");
        int[] arr = {1, 6, 9};
        int[] arr2 = new int[2];
        arr2[0] = 5;
        arr2[1] = 4;

        findMin(arr);
        findMin(arr2);
        findMin(new int[] {-1, 6, -5});
        System.out.println("Fim");
    }

     static void findMin(int[] array) {
        //int[] array = {3,5,9,12,2};
        int min = Integer.MAX_VALUE;

        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }
         System.out.println(min);
     }
}
