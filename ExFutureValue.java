package primeirosprogramas;

public class ExFutureValue {
    public static void main(String[] args) {

        //fv = pv * (1 + i) ** n;
        //fv = future value;
        //pv = present value;
        //i = interest rate;
        //n = number installments;

        double fv;
        double pv = 30000;
        double i = 2;
        i = (i / 100) + 1;
        int n = 24;

        double potentiation = Math.pow(i, n);
        fv = pv * potentiation;
        System.out.println("The final amount is: " + fv);

    }
}
