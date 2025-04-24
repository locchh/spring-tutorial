package loops;

public class ForEachLoopExample {
    public static void main(String[] args) {

        // String Initialization
        //String[] names = {"John", "Jane", "Jill", "Jack", "Jenny"};
        //String[] names = new String[] {"John", "Jane", "Jill", "Jack", "Jenny"};
        // String Declaration
        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jill";
        names[3] = "Jack";
        names[4] = "Jenny";

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("**************************");

        for(String name : names){
            System.out.println(name);
        }


    }
}
