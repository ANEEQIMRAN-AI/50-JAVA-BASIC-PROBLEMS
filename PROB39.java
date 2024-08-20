//program to find the area of a square
import java.util.*;
public class PROB39 {
    public void AreaofSquare(int length){
        int Area;
        Area=length*length;
        System.out.println("Area of a square is "+Area+" sq meter");
    }
    public static void main(String[] args) {
        int l,b;
        PROB39 P39=new PROB39();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        l=sc.nextInt();
        P39.AreaofSquare(l);

    }
}
