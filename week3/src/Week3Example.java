import java.util.Scanner;

public class Week3Example {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input inches to convert: ");
        int inch = scanner.nextInt();
        double cm = inch * CM_PER_INCH;
        scanner.nextLine();
        System.out.println("Inches: " + inch);
        System.out.println("Cm: " + cm);
        System.out.printf("Four thirds = %f", 4.0/3.0);


        scanner.close();
    }
}
