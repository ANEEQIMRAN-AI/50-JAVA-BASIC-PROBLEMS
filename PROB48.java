//program to calculate the surface area of cone
import java.util.*;
public class PROB48 {
    public void Surfacearea(int height, int radius){
        final float pi=3.147f;
        float area;
        float val=height*height+radius*radius;
        area= (float) (pi*radius*(radius+Math.sqrt(val)));
        System.out.println("surface area of cone is "+area+" sq meter");
    }
    public static void main(String[] args) {
        int value1,value2;
        PROB48 P48=new PROB48();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height");
        value1=sc.nextInt();
        System.out.println("Enter radius");
        value2=sc.nextInt();
        P48.Surfacearea(value1,value2);
    }
}
