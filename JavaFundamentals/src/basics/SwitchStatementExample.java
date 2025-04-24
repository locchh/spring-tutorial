package basics;
import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("admin - Get Full Access");

        System.out.println("subadmin - Get access to create/delete courses");

        System.out.println("testprep - Get access to create/delete tests");

        System.out.println("user - Get access to consume content");

        System.out.println("Enter your choice: ");

        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Get Full Access");
                break;
            case "subadmin":
                System.out.println("Get access to create/delete courses");
                break;
            case "testprep":
                System.out.println("Get access to create/delete tests");
                break;
            case "user":
                System.out.println("Get access to consume content");
                break;
            default:
                System.out.println("Invalid user type");
        }
    }
}
