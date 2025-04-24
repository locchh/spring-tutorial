package conditions;

public class ConditionsWithOperatorExample {
    public static void main(String[] args) {

        boolean isLoggedIn = true;
        boolean isEmailVerified = true;
        boolean isCardInfoValid = true;

        if(isLoggedIn && isEmailVerified && isCardInfoValid) {
            System.out.println("User is eligible for discount");
        }
        else{
            System.out.println("User is not eligible for discount");
        }

    }
}
