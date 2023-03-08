package primeirosprogramas;
public class ExFutureValueCTosin2 {
    public static void main(String[] args) {
        double pv = 30000;
        double i = 1.5 / 100;// ao mês
        int n = 12;
        double potencia = Math.pow((1 + i), n);
        double fv = pv * potencia;

        System.out.println(fv);
    }
}
