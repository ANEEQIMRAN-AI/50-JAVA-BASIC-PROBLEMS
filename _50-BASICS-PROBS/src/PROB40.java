//program to find the perimeter of a square
import java.util.*;
public class PROB40 {
    public void Squareperimeter(int side){
        int perimeter;
        perimeter=4*side;
        System.out.println("Perimeter of square is "+perimeter+" m");
    }
    public static void main(String[] args) {
        int value;
        PROB40 P40=new PROB40();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side");
        value=sc.nextInt();
        P40.Squareperimeter(value);

    }
}
