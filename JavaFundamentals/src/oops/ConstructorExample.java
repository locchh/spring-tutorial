package oops;

import java.util.Scanner;

// class learner exends Object{...}
class Learner{

    // Data members
    private int learnerId;
    private String learnerName;
    private int learnerAge;

    // Default constructor
    public Learner(){
        this.learnerId = 100;
        this.learnerName = "Unknown";
        this.learnerAge = 18;
    }

    // Parameterized constructor
    public Learner(int learnerId, String learnerName, int learnerAge){
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerAge = learnerAge;
    }

    void displayDetails(){
        System.out.println("learner id: " + this.learnerId);
        System.out.println("learner name: " + this.learnerName);
        System.out.println("learner age: " + this.learnerAge);
    }

    //
}
public class ConstructorExample {
    public static void main(String[] args) {
        // Create object of Learner class by default constructor
        //Learner learner = new Learner();

        // Create object of Learner class by parameterized constructor
        Learner learner = new Learner(101, "John", 25);

        learner.displayDetails();
    }
}
