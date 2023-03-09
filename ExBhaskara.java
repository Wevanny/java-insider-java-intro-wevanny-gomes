package primeirosprogramas;

public class ExBhaskara {
    public static void main(String[] args) {
        //Second degree equation:
        //ax²(Math.pow(a * x, 2) + bx + c = 0;
        //x = (-b ± √▲) / 2 * a;
        //▲ = b² - 4 * a * c;

        double a = 1;
        double b = -1;
        double c = -12;

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);

        double x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
        System.out.println("x1 = " + x1);

        double x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
        System.out.println("x2 = " + x2);

        double equation1 = Math.pow(a * x1, 2) + b * x1 + c;
        System.out.println("Equation with x1 = " + equation1);

        double equation2 = Math.pow(a * x2, 2) + b * x2 + c;
        System.out.println("Equation with x2 = " + equation2);
    }
}
