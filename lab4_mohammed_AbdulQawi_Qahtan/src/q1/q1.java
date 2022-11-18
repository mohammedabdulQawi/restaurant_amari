/*Write a PerimeterTester program that constructs a Rectangle object and then
        computes and prints its perimeter. Use the getWidth and getHeight methods.
        Also print the expected answer.*/
package q1;
import java.awt.Rectangle;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

    double area,width,height;


    Rectangle rectangle = new Rectangle (10,20,50,40);
    Scanner mm = new Scanner (System.in);

    width = rectangle.getWidth();
    height = rectangle.getHeight();
    area = width * height;

    System.out.println("The area of rectangle is :"+area);
    System.out.println("The expected area is 2000.0.");
}
}
