package loops;

import java.util.Scanner;

public class JumpStatementExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while(true){
            System.out.println("Enter your message: ");
            input = scanner.nextLine().toLowerCase();

            if(input.equals("quit")) {
                break;
            }

            if(input.equals("pass")){
                continue;
            }

            System.out.println("You entered: " + input);
        }

        System.out.println("Out of the loop");


    }
}
