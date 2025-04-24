package basics;

public class SingleDimensionArrayExample {
    public static void main(String[] args) {

        //  Declaration an arrays
        //int[] masks = new int[5];

        //  Initialization an arrays
        //int[] marks = new int[5]{10,20,30,40,50};

        // Declare and Assign
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        for(int i=0;i < marks.length;i++) {
            System.out.println(marks[i]);
        }

        System.out.println("**************************");

        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
