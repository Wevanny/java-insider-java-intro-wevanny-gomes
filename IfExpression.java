package primeirosprogramas;

public class IfExpression {
    public static void main(String[] args) {

        int idade = 19;
        int pontos = 3;

        //if(){
        //bloco
        //}

        if(idade >= 18){
            System.out.println("Maior de idade");
            pontos = pontos * 2;
        }


        System.out.println("Fim. Pontos = " + pontos);

    }
}
