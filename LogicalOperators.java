package primeirosprogramas;

public class LogicalOperators {
    public static void main(String[] args) {

        int idade = -1;

        if(idade >= 0 && idade <= 11) {
            System.out.println("Criança");
        } else if(idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else if(idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade inválida");
        }
    }
}
