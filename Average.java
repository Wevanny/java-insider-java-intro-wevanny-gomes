package primeirosprogramas;
public class Average {

    public static void main(String[] args) {

        double[] grades = new double[5];
        grades[0] = 8.5;
        grades[1] = 7.0;
        grades[2] = 7.5;
        grades[3] = 6.0;
        grades[4] = 10.0;

        double sum = 0;
        double max = grades[0];
        double min = grades[0];

        for (double grade : grades) {
            sum = sum + grade;
            if (grade > max) {
                max = grade;
            } else if (grade < min) {
                min = grade;
            }
        }

        double avg = sum / grades.length;
        System.out.println("Average: " + avg);
        System.out.println("Maximum grade: " + max + " and Minimum grade: " + min);

    }
}
