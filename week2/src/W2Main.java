public class W2Main {
    public static void main(String[] args) {
        // [datatype] [variable] = [value]

        String messageA;
        String messageB = "Rajeev";

        int num1 = 20;
        int num2 = 15;
        int total;

        messageA = "10";

        System.out.println("Hello Rajeev");
        System.out.println(messageA + " " + messageB);

        total = num1 + num2;
        System.out.println("The sum of " + num1 + " + " + num2 + " is " + total);

        double num3 = 10.0;
        double num4 = num3;
        num3 = 20;

        System.out.println(num3 + num4);
    }
}
