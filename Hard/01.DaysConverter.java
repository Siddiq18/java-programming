import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = days - (years * 365 + weeks * 7);
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + remainingDays);

        scanner.close();
    }
}
