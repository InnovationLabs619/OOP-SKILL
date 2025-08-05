
import java.util.Scanner;

public class ageofapersonbydob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example date of birth
        System.out.print("Enter date of birth (YYY-MM-DD): ");
        String dob = scanner.nextLine();
        int age = calculateAge(dob);
        System.out.println("Age: " + age + " years");
        
        scanner.close();
    }

    public static int calculateAge(String dob) {
        String[] parts = dob.split("-");
        int birthYear = Integer.parseInt(parts[0]);
        int birthMonth = Integer.parseInt(parts[1]);
        int birthDay = Integer.parseInt(parts[2]);

        java.util.Calendar today = java.util.Calendar.getInstance();
        int currentYear = today.get(java.util.Calendar.YEAR);
        int currentMonth = today.get(java.util.Calendar.MONTH) + 1; 
        int currentDay = today.get(java.util.Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }
}
