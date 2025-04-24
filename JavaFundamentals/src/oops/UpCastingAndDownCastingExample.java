package oops;


class Notification{
    private String message;
    void notifyUser(){
        System.out.println("Sending a general notification");
    }

    // Constructor
    Notification(String message){
        this.message = message;
    }

    void displayMessage(){
        System.out.println("Message: " + message);
    }
}

class EmailNotification extends Notification{
    EmailNotification(String message) {
        super(message);
    }
    void sendEmail(){
        System.out.println("Sending an email notification...");
    }
}

public class UpCastingAndDownCastingExample {

    public static void main(String[] args) {

        // UpCasting (automatic, safe)
        Notification notification = new EmailNotification("Hello");
        notification.notifyUser(); // Allowed (method exists in super class)
        //notification.sendEmail(); // Not allowed (method does not exist in super class)
        notification.displayMessage();

        // DownCasting (explicit, unsafe)
        if (notification instanceof EmailNotification) {// Always check before downcasting
            EmailNotification emailNotification = (EmailNotification) notification; // DownCasting
            emailNotification.sendEmail(); // Allowed (method exists in sub class)
            emailNotification.displayMessage();
    }
        else{
            System.out.println();
        }
    }
}
