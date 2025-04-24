package oops;

interface IABCBank{
    void openAccount();
    void closeAccount();
    // We can have default methods (NOT abstract)
    default void displayMessage(String message){
        System.out.println(message);
    }
}

interface IBankAccount{
    // methods of interface are by default abstract
    void deposit();
    void withdraw();
    void balance();
}

// class can implement more than one interface
class Saving implements IBankAccount, IABCBank{

    @Override
    public void deposit() {
        System.out.println("Deposit in savings account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from savings account");
    }

    @Override
    public void balance() {
        System.out.println("Balance in savings account");
    }

    @Override
    public void openAccount() {
        System.out.println("Savings account open");
    }

    @Override
    public void closeAccount() {
        System.out.println("Savings account close");
    }
}
public class InterfaceExample {

    public static void main(String[] args) {

        Saving saving = new Saving();
        saving.displayMessage("Wellcome to ABC Bank");
        saving.openAccount();
        saving.deposit();
        saving.withdraw();
        saving.balance();
        saving.closeAccount();
    }
}
