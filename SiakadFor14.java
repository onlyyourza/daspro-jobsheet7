import java.util.Scanner;
public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade;
        double highest = 0;
        double lowest = 100;

        for (int i = 1; i <=10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("The highest grade is: " + highest);
        System.out.println("The lowest grade is: " + lowest);
        sc.close();
    }
}