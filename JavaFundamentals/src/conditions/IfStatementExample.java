package conditions;

public class IfStatementExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;

//        if (isAuthenticated) {
//            System.out.println("User is authenticated");
//        }
//        if (!isAuthenticated) {
//            System.out.println("User is not authenticated");
//        }

//        if (isAuthenticated) {
//            System.out.println("User is authenticated");
//        }
//        else{
//            System.out.println("User is not authenticated");
//        }

        float sellingPrice = 120.00f, costPrice = 100.00f;

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        }
        else if (sellingPrice < costPrice) {
            System.out.println("Loss");
        }
        else {
            System.out.println("Neither");
        }

    }
}
