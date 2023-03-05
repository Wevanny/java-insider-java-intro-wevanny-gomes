package primeirosprogramas;
public class ExFibonacci {

    public static void main(String[] args) {

        int n = 15;
        int fibonacci;
        int current = 0;
        int previus = 1;

        for (int i = 1; i <= n; i++) {
            fibonacci = current + previus;
            previus = current;
            current = fibonacci;
            System.out.print(fibonacci + ", ");
        }
    }
}
