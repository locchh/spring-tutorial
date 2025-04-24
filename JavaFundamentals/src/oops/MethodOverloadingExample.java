package oops;

class Calculation{

    // Static Method Allows you to call the method without creating an object
    public static int addition (int num1, int num2){
        return num1 + num2;
    }

    public static int addition (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static float addition (float num1, float num2){
        return num1 + num2;
    }

    public static double addition (int num1, float num2){
        return num1 + num2;
    }

    public static double addition (float num2, int num1){
        return num1 + num2;
    }

}

public class MethodOverloadingExample {

    public static void main(String[] args) {

        System.out.println(Calculation.addition(100,200));

        System.out.println(Calculation.addition(100,200,300));

        System.out.println(Calculation.addition(100.50f,200.30f));

        System.out.println(Calculation.addition(100,200.40f));

        System.out.println(Calculation.addition(100.39f,200));
    }
}
