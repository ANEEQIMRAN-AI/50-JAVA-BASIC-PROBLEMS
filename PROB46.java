//program to calculate the surface area of cylinder
import java.util.*;
public class PROB46 {
    public void Surfacearea(int height, int radius){
        final float pi=3.147F;
        float Area;
        Area=2*pi*radius*(height+radius);
        System.out.println("Surface area of cylinder is "+Area+" sq meter");
    }
    public static void main(String[] args) {
        int value1;
        int value2;
        PROB46 P46=new PROB46();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height");
        value1=sc.nextInt();
        System.out.println("Enter radius");
        value2=sc.nextInt();
        P46.Surfacearea(value1,value2);
    }
}
