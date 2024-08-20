//program to find the Volume of sphere
import java.util.*;
public class PROB44 {
    public void Volumeofsphere(int radius){
        float val=4/3F;
        float Area;
        final float pi=3.147F;
        Area=val*pi*radius*radius*radius;
        System.out.println("Area of sphere is "+ Area+" sq meter");
    }
    public static void main(String[] args) {
        int value;
        PROB44 P44=new PROB44();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        value=sc.nextInt();
        P44.Volumeofsphere(value);

    }
}
