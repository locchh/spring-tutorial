package conditions;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        /*
        if (isAuthenticated) {
            System.out.println("User is authenticated");
        } else {
            System.out.println("User is not authenticated");
        }
        */

        String message = isAuthenticated ? "User is authenticated" : "User is not authenticated";
        System.out.println(message);

    }
}
