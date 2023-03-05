package primeirosprogramas;

public class ExFinePaymentCalculation {
    public static void main(String[] args) {
        int speed = 110;
        double fine = 0;

        if (speed > 80 && speed <= 100) {
            fine = 67;
        } else if (speed > 100) {
            fine = 70 + 10 * (speed - 100);
        } else if (speed <= 80) {
            fine = 0;
        }

        if (fine > 0) {
            System.out.println("The fine for speeding " + speed + "km " + " is " + " R$" + fine);
        } else {
            System.out.println("There is no fine.");
        }

    }
}
