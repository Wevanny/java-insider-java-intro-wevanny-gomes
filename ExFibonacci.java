package primeirosprogramas;
public class ExFibonacci {

    public static void main(String[] args) {

        int term = 15;
        int fibonacci;
        int current = 0;
        int previus = 1;

        /*for (int i = 1; i <= term; i++) {
            fibonacci = current + previus;
            previus = current;
            current = fibonacci;
            System.out.print(fibonacci + ", ");
        }*/

        //OU:

        for (int i = 0; i < term; i++) {
            fibonacci = current + previus;
            previus = current;
            current = fibonacci;
            System.out.println("Sequência Fibonacci: " + fibonacci);
        }
    }
}
