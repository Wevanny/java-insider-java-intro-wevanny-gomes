package primeirosprogramas;

public class CastingCTosin {
    public static void main(String[] args) {

        int a = 5 / 5;
        int b = 5 / 2;
        double c = 5 / 2;
        double d = 5.0 / 2;
        double e = 5 / 2.0;
        double f = 5.0 / 2.0;
        double g = (double) 5 / 2;
        //Não é possível armazenar double em int. Ex: int h = f. Para isso preciso fazer uma operação de Casting. Ex: int h = (int) a;
        int h = (int) f;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
