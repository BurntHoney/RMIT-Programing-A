public class Date {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        String day, month;
        int date, year;

        day = "Friday";
        month = "February";
        date = 16;
        year = 2024;

        System.out.println(day);
        System.out.println(month);
        System.out.println(date);
        System.out.println(year);

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year );
    }
}
