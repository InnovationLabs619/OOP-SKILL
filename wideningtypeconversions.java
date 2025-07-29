public class wideningtypeconversions {
    public static void main(String[] args) { 
        int intValue = 123456789;
        long longValue = intValue; // int to long (widening)
        float floatValue = longValue; // long to float (widening)

        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
    }
}
