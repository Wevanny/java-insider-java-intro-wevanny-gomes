package primeirosprogramas;

public class BreakingLoopCTosin {
    public static void main(String[] args) {

        /*while (true) {
            int n = (int) (Math.random() * 100 + 1);
            System.out.println(n);

            if (n > 50) {
                break;
            }
        }

        System.out.println("Encontrou número alto!");*/
        //OU --> Com e sem break

        int n = 0;
        while (n <= 50) {
            n = (int) (Math.random() * 100 + 1);
            System.out.println(n);
        }
        System.out.println("Encontrou número alto!");
    }
}
