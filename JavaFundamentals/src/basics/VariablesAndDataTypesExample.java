package basics;

import java.awt.*;
import java.util.Date;
// Copy primitive data types does not  affect the original
// Copy reference data types affect the original
public class VariablesAndDataTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        byte age =23;
        long viewCount = 1_112_345_678L;
        float price = 234.56f;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(age);
        System.out.println(viewCount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);

        // Reference data types
        String name = "King Kochhar";
        System.out.println(name);
        Date now  = new Date();
        System.out.println(now);

        Point point1 = new Point(10,20);
        Point point2 = point1; // Copy the reference
        System.out.println(point1.x +  " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);

        point1.y = 30;
        System.out.println(point1.x + " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);

    }
}
