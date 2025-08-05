import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomDateTimeFormatter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDateTime now = LocalDateTime.now();

            System.out.println("Please enter your desired date/time format pattern.");
            System.out.println("Common Patterns:");
            System.out.println("  - dd/MM/yyyy HH:mm:ss   (e.g., 05/08/2025 14:51:59)");
            System.out.println("  - MM-dd-yyyy hh:mm a    (e.g., 08-05-2025 02:51 PM)");
            System.out.println("  - EEEE, MMMM dd, yyyy   (e.g., Tuesday, August 05, 2025)");
            System.out.print("\nEnter your format: ");
            
            String pattern = scanner.nextLine();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
                String formattedDateTime = now.format(formatter);

                System.out.println("\nFormatted Date and Time:");
                System.out.println(formattedDateTime);

            } catch (IllegalArgumentException e) {
                System.err.println("\nError: Invalid format pattern provided.");
                System.err.println("Please check the syntax of your pattern.");
            }
        }
    }
}