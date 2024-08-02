//program to find the perimeter of triangle
import java.util.*;
public class PROB38 {
    public void TrianglePerimeter(int a, int b, int c){
        int perimeter;
        perimeter=a+b+c;
        System.out.println("Perimeter of triangle is "+perimeter+" m");

    }
    public static void main(String[] args) {
        int side1,side2,side3;
        PROB38 P38 =new PROB38();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        side1=sc.nextInt();
        System.out.println("Enter side 2");
        side2=sc.nextInt();
        System.out.println("Enter side 3");
        side3=sc.nextInt();
        P38.TrianglePerimeter(side1,side2,side3);

    }
}
