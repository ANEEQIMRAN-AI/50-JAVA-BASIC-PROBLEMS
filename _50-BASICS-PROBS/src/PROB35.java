//program to calculate the area of circle
import java.util.*;
public class PROB35 {
    public void Areaofcircle(int radius){
        float area;
        final float pi=3.147F;
        area=pi*radius*radius;
        System.out.println("Area of circle is "+area+" sq m");

    }
    public static void main(String[] args) {
        int value;
        PROB35 P35= new PROB35();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        value=sc.nextInt();
        P35.Areaofcircle(value);

    }
}
