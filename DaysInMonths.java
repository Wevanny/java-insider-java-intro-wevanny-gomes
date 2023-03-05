package primeirosprogramas;

import java.sql.SQLOutput;

public class DaysInMonths {
    public static void main(String[] args) {
        int month = 2;
        int year = 2400;
        int days = 0;

        if(month == 2) {
            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                days = 29;
            } else if(year % 4 == 0 && year % 100 != 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else {
            System.out.println("Entrada inválida!");
        }

        System.out.println("O mês tem: " + days + " dias.");
    }
}
