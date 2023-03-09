package primeirosprogramas;

public class ExFutureValueCTosin {
    public static void main(String[] args) {
        double pv = 30000;
        double i = 0.02; //2% ao mês
        int n = 24;

        double fv = pv * Math.pow(1 + i, n);
        System.out.println("Valor final: " + fv);
    }
}
