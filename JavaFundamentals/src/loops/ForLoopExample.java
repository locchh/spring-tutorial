package loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

//        for(int i=1; i <= 10; i++){
//            System.out.println("Hello Wolrd " + i);
//        }

//        int i = 1;
//        while (i <= 10) {
//            System.out.println("Hello World " + i);
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);
//
        String input = "";
//
//        while(!input.equals("quit")){
//            System.out.println("Enter your message: ");
//            input = scanner.next().toLowerCase();
//            System.out.println("You entered: " + input);
//
//        }

        do {
            System.out.println("Enter your message: ");
            input = scanner.next().toLowerCase();
            System.out.println("You entered: " + input);
        } while (!input.equals("quit"));
    }
}
