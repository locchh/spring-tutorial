package oops;

import java.util.Scanner;

class Student{
    // Attributes
    private int studentId;
    private String studentName;
    private int studentAge;
    Scanner scanner = new Scanner(System.in);

    // Methods
    void acceptDetails(){
        System.out.println("Enter student id: ");
        studentId = scanner.nextInt();
        System.out.println("Enter student name: ");
        studentName = scanner.next();
        System.out.println("Enter student age: ");
        studentAge = scanner.nextInt();
    }

    public void displayDetails(){
        System.out.println("Student id: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Student age: " + studentAge);
    }
}

public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        // Creae object of class
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();

        Student student1 = new Student();
        student1.acceptDetails();
        student1.displayDetails();

    }
}
