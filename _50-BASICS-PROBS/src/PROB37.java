//program to find the area of a triangle
import java.util.*;
public class PROB37 {
    public void Areaoftriangle(int base,int height){
        float half=0.5F;
        float area;
        area=half*base*height;
        System.out.println("Area of triangle is "+area+" sq meter");
    }
    public static void main(String[] args) {
        int value1;
        int value2;
        PROB37 P37=new PROB37();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        value1=sc.nextInt();
        System.out.println("Enter height");
        value2=sc.nextInt();
        P37.Areaoftriangle(value1,value2);



    }
}
