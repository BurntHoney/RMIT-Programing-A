import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day: ");
        String day = scanner.nextLine();

        System.out.print("Please enter the month: ");
        String month = scanner.nextLine();

        System.out.print("Please enter the date: ");
        String date = scanner.nextLine();

        System.out.print("Please enter the year: ");
        String year = scanner.nextLine();

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year );

        scanner.close();
    }
}
