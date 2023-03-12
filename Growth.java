package primeirosprogramas;
public class Growth {

    public static void main(String[] args) {
        double v = calculateGrowth(5, 7);
        System.out.println(v);
        System.out.println(calculateGrowth(5, 7));
    }

    static double calculateGrowth(double valueStart, double valueEnd) {
        //double v = ((valueEnd - valueStart) / valueStart)
        //double v = (valueEnd - valueStart) / valueStart;
        return ((valueEnd - valueStart) / valueStart) * 100;
    }
}
