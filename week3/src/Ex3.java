import java.math.BigDecimal;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = scanner.nextDouble();

        System.out.printf("The sum of %f and %f is %f\n", num1, num2, num1 + num2);
        System.out.printf("The difference of %f and %f is %f\n", num1, num2, num1 - num2);
        System.out.printf("The product of %f and %f is %f\n", num1, num2, num1 * num2);
        System.out.printf("The quotient of %f and %f is %f\n", num1, num2, num1 / num2);

        scanner.close();
    }
}
