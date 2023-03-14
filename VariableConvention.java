package primeirosprogramas;

public class VariableConvention {
    public static void main(String[] args) {

        int age;
        int $age; // não recomendado, *má prática
        int _age; // não recomendado, *má prática
        int age2;
        int Age; // não recomendado, foge da convenção
        int AGE; // não recomendado, foge da convenção

        String first_name; // não recomendado, foge da convenção
        String firstName; //camel case
        String lastName; // OK!

        // Não posso usar palavras reservadas para a criação de variáveis.
        // Posso usar a palavra String ou string, pois apesar de representar uma classe ela não é reservada.


        System.out.println("Hello Codiva");

    }
}
