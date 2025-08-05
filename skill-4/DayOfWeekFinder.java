import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekFinder {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a date in YYYY-MM-DD format: ");
            String dateString = scanner.nextLine();

            try {
                LocalDate date = LocalDate.parse(dateString);
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
                System.out.println("The date " + date + " is a " + dayName + ".");
                
            } catch (DateTimeParseException e) {
                System.err.println("Error: Invalid date format. Please use the YYYY-MM-DD format.");
            }
        }
    }
}