//program to calculate surface area of cube
import java.util.*;
public class PROB50 {
    public void Surfacearea(int side){
        int area;
        area=6*side*side;
        System.out.println("Surface area of a cube is "+area+" sq meter");

    }
    public static void main(String[] args) {
        int value;
        PROB50 P50=new PROB50();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cube side ");
        value=sc.nextInt();
        P50.Surfacearea(value);
    }
}
