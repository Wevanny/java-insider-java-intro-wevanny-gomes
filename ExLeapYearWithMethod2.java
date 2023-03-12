package primeirosprogramas;

public class ExLeapYearWithMethod2 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));

    }
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return  true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
