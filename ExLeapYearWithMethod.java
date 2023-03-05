package primeirosprogramas;
public class ExLeapYearWithMethod {
    public static void main(String[] args) {
        String answer = leapYear(1996);
        System.out.println(answer);
    }
    static String leapYear(int year) {
        String answer;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            answer = "Is leap year!";
        } else {
            answer = "Is not leap year!";
        }
        return answer;
    }
}
