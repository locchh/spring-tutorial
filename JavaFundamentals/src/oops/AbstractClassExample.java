package oops;

abstract class ABCBank{
    abstract void openAccount();
    abstract void closeAccount();

    public void displayMessage(String message) {
        System.out.println("Message: " + message);
    }
}

abstract class BankAccount extends ABCBank {
    abstract void deposit();

    abstract void withdraw();

    abstract void balance();
}

// One class can Not extend more than one abstract class
// class SavingsAccount extends BankAccount, ABCBank {}
class SavingsAccount extends BankAccount {

    @Override
    void deposit() {
        System.out.println("Deposit in savings account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from savings account");
    }

    @Override
    void balance() {
        System.out.println("Balance in savings account");
    }

    @Override
    void closeAccount() {
        System.out.println("Savings account close");
    }

    @Override
    void openAccount() {
        System.out.println("Savings account open");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Current account deposit");
    }

    @Override
    void withdraw() {
        System.out.println("Current account withdraw");
    }

    @Override
    void balance() {
        System.out.println("Current account balance");
    }

    @Override
    void closeAccount() {
        System.out.println("Current account close");
    }

    @Override
    void openAccount() {
        System.out.println("Current account open");
    }
}
public class AbstractClassExample {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.openAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.balance();
        savingsAccount.closeAccount();


        System.out.println("*****************");

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.openAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();
        currentAccount.closeAccount();

    }
}
