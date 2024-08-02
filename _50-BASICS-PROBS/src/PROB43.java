//program to find the area of sphere
import java.util.*;
public class PROB43 {
    public void Spherearea(int radius){
        float Area;
        final float pi=3.147F;
        Area=4*pi*radius*radius;
        System.out.println("Area of sphere is "+ Area+" sq meter");
    }
    public static void main(String[] args) {
        int value;
        PROB43 P43=new PROB43();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        value=sc.nextInt();
        P43.Spherearea(value);

    }
}
