import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total;

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        total = num1 + num2;
        System.out.println("The running total is " + total);

        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();

        total += num3;
        System.out.println("The running total is " + total);

        System.out.print("Enter num4: ");
        int num4 = scanner.nextInt();

        total += num4;
        System.out.println("The final total is " + total);

        scanner.close();
    }
}
