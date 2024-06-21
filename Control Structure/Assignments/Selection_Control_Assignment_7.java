import java.util.Scanner;

public class Selection_Control_Assignment_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        scanner.close();

        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Number of days in each month
        int[] daysInMonth = { 31, (isLeapYear ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Move to the next day
        day++;

        // Check if day exceeds the days in the current month
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;

            // Check if month exceeds 12
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.printf("%d-%d-%d", day, month, year);
    }
}
