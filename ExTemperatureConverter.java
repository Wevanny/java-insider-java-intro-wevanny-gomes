package primeirosprogramas;

public class ExTemperatureConverter {
    public static void main(String[] args) {
        //tc = ((tf - 32) / 9) * 5;
        //tf = temperatura em Fahrenheit;
        //tc = temperatura em Celsius;

        double tf = 84.5;
        double tc;

        tc = ((tf - 32) / 9) * 5;
        //ou tc = ((tf - 32)) / 9 * 5;
        System.out.println("The conversion to Celsius is: " + tc);

    }
}
