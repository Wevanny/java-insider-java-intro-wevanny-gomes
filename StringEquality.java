package primeirosprogramas;
public class StringEquality {
    public static void main(String[] args) {
        /* String a = "dog";
       //String b = "cat";
       String b = "dog"; */

      /* if (a == b) {
            System.out.println("Strings equal!");
         } else {
            System.out.println("Strings different!");
         } */

        //Podem ser ou não o mesmo objeto na memória pois Strings são objetos e por esse motivo estão sendo comparadas
        // suas referências e não seu conteúdo.
        //No exemplo acima a comparação deu certo mas no exemplo abaixo não.

        String a = new String("dog");
        String b = new String("dog");

    /* if (a == b) {
      System.out.println("Strings equal!");
    } else {
      System.out.println("Strings different!");
    } */

        //A forma correta de fazer, funciona em todos os casos de comparação de conteúdo de Strings.
        if (a.equals(b)) {
            System.out.println("Strings equal!");
        } else {
            System.out.println("Strings different!");
        }
    }
}
