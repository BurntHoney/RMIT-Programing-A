import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);

        System.out.println("I am thinking of a number between 1 and 100 (including both)");

        System.out.print("Enter a number: ");
        int guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);
        System.out.println("The number i was thinking of is: " + number);
        System.out.println("You were off by " + (number-guess));

        scanner.close();
    }
}
