package primeirosprogramas;
public class ExCharReplace {
    public static void main(String[] args) {
        System.out.println(replaced("lorota", "r", "l" ));
    }
    static String replaced(String toReplace, String searched, String change) {
        if (toReplace == null || toReplace.length() == 0) {
            return toReplace;
        }
        return toReplace.replace(searched, change);
    }
}
