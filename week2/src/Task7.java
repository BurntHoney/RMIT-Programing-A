public class Task7 {
    public static void main(String[] args) {
        String item1Name = "Laptop";
        double item1Price = 3239.0;

        String item2Name = "banana";
        double item2Price = 0.50;

        String item3Name = "Watch";
        double item3Price = 620.39;

        System.out.println("TAX INVOICE ");
        System.out.println("The Imaginary Store");
        System.out.println("1912 Harvest Lane");
        System.out.println("Derek Water, Melbourne 3005");
        System.out.println("Monday 19th of February 2024 at 11:53 am");
        System.out.println("\nItems Purchased:");
        System.out.println(" - " + item1Name + " " + item1Price);
        System.out.println(" - " + item2Name + " " + item2Price);
        System.out.println(" - " + item3Name + " " + item3Price);

        double total = item1Price + item2Price + item3Price;
        double gst = total * 0.1;
        double finalTotal = total + gst;
        System.out.println("GST: " + gst);
        System.out.println("Total Price: " + finalTotal);

    }
}
