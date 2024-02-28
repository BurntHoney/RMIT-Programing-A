import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student 1's Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student 1's Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student 2's Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student 2's Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student 3's Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter student 3's Age: ");
        int age3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student 4's Name: ");
        String name4 = scanner.nextLine();
        System.out.print("Enter student 4's Age: ");
        int age4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.printf("student 1's name is %s and age is %d\n", name1, age1);
        System.out.printf("student 2's name is %s and age is %d\n", name2, age2);
        System.out.printf("student 3's name is %s and age is %d\n", name3, age3);
        System.out.printf("student 4's name is %s and age is %d\n", name4, age4);


        scanner.close();
    }
}
