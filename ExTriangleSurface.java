package primeirosprogramas;
public class ExTriangleSurface {
    public static void main(String[] args) {
        System.out.println(triangleArea(5,3));
    }
    static double triangleArea(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }
}
