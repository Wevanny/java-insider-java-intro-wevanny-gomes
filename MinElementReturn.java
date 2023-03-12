package primeirosprogramas;
public class MinElementReturn {

    public static void main(String[] args) {

        /*int min1 = findMin(new int[] {1, 6, 9});
        System.out.println(min1);

        int min2 = findMin(new int[] {-5, 4, -3});
        System.out.println(min2);

        int min3 = findMin(new int[] {5, 4, 3});
        System.out.println(min3);*/

        System.out.println("Início");
        int[] arr = {1, 6, 9};
        int[] arr2 = new int[2];
        arr2[0] = 5;
        arr2[1] = 4;

        int min1 = findMin(arr);
        System.out.println(min1);
        int min2 = findMin(arr2);
        System.out.println(min2);
        int min3 = findMin(new int[] {-1, 6, -5});
        System.out.println(min3);
        System.out.println("Fim");
    }

    static int findMin(int[] array) {
        //int[] array = {3,5,9,12,2};
        int min = Integer.MAX_VALUE;

        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

}

