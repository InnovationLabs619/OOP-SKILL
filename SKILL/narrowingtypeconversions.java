import java.util.Scanner;

public class narrowingtypeconversions {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float number = n.nextFloat(); // Accept float input
        long longValue = (long) number; // float to long (narrowing)
        int intValue = (int) longValue; // long to int (narrowing)

        System.out.println("long value: " + longValue);
        System.out.println("int value: " + intValue);
        n.close();
    }
}
