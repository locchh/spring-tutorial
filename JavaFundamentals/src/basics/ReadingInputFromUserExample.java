package basics;

import java.util.Scanner;

public class ReadingInputFromUserExample   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your gender (M/F)");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter your contact number");
        double contact = scanner.nextDouble();
        System.out.println("User details");
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Gender is " + gender);
        System.out.println("Contact is " + contact);
    }
}
