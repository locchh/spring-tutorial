package basics;

public class TypeCastingExample {
    public static void main(String[] args) {
        /*
        Explicit type casting
        byte -> short -> int -> long -> float -> double
        int intValue = 100;

        // Implicit type casting from int to long
        long longValue = intValue;
        // Implicit type casting from int to double
        double doubleValue = intValue;

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println();

        // Explicit type casting from long to int
         */

        double doubleValue = 200.56;

        // Explicit type casting from double to int
        int intValue = (int)doubleValue;

        System.out.println(intValue);

        // Explicit type casting from double to byte
        byte byteValue = (byte) doubleValue;
        System.out.println(byteValue);

    }
}
