package primeirosprogramas;

public class ExBhaskara2 {
    public static void main(String[] args) {

        double a = 1;
        double b = -1;
        double c = -12;
        double delta = Math.pow(b, 2) - 4 * a * c; // delta = 49.0

        double x1 = (-b + Math.sqrt(delta)) / (2 * a); //x1 = 4.0
        double x2 = (-b - Math.sqrt(delta)) / (2 * a); // x2 = -3.0

        double equacao = a * Math.pow(x1, 2) + b * x1 + c;
        double equacao2 = a * Math.pow(x2, 2) + b * x2 + c;


        System.out.println("Delta é: " + delta + " ,x1 é: " + x1 + " e x2 é: " + x2);
        System.out.println("Equação x1 = " + equacao);
        System.out.println("Equação x2 = " + equacao2);
    }
}
