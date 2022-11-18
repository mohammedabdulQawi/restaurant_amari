import java.awt.*;

public class q4 {
    int Width = 5;
    int Height = 8;
    public static void main(String args[]) {
        Rectangle bob = new Rectangle(0, 0, 5, 8);
        double area = bob.getWidth() + bob.getHeight();
        System.out.println("area = " + area);


        double perimeter =  (bob.getHeight()) +  (bob.getWidth());
        System.out.println("get the perimeter = " + perimeter);
    }
}
