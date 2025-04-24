package basics;

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Reminder: " + (num1 % num2));

        System.out.println("Post Increment: " + num1++);
        System.out.println("Pre Increment: " + ++num1);

        System.out.println("Post Decrement: " + num1--);
        System.out.println("Pre Decrement: " + --num1);
    }
}
