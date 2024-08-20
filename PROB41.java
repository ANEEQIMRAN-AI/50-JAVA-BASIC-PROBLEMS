//program to find area of rectangle
import java.util.*;
public class PROB41 {
    public void Rectanglearea(int length, int breadth){
        int Area;
        Area=length*breadth;
        System.out.println("Area of rectangle is "+Area+" sq meter");
    }

    public static void main(String[] args) {
        int l,b;
        PROB41 P41=new PROB41();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
        P41.Rectanglearea(l,b);

    }
}
