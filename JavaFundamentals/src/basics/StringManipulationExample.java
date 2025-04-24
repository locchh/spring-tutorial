package basics;

public class StringManipulationExample {
    public static void main(String[] args) {
        // String is Immutable
        // Declare a string
        String str1 = "Hello ";
        System.out.println(str1);

        // Declare as constructor
        String str2 = new String("World");
        System.out.println(str2);

        // Concatenation
        String str3 = str1 + str2;
        System.out.println(str3);

        System.out.println(str3.length());

        System.out.println(str3.charAt(0));

        System.out.println(str1.concat(str2));

        System.out.println(str3.substring(0, 5));

        System.out.println(str1.equals(str2));

        System.out.println(str3.contains(str1));

        System.out.println(str3.toLowerCase());

        System.out.println(str3.toUpperCase());

        // These are most string methods
        // Split()
        // Substring()
        // length()
        // replace()
        // ToLowerCase()
        // ToUpperCase()
        // contains()
        // trim()
        // concat()
        // indexOf()
        // charAt()
        // equals()

    }
}
