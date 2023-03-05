package primeirosprogramas;

public class LogicalOperatorsCarlos {
    public static void main(String[] args) {

        int idade = 0;
        String categoria = null;

        if(idade > 0 && idade <= 12) {
            categoria = "CRIANÇA";
        } else if(idade > 12 && idade <= 17) {
            categoria = "ADOLESCENTE";
        } else if(idade >= 18) {
            categoria = "ADULTO";
        } else {
            categoria ="DESCONHECIDA";
        }

        System.out.println("Categoria para " + idade + " anos: " + categoria);
    }
}
