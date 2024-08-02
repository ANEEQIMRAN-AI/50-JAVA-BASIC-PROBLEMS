//program to find the perimeter of rectangle
import java.util.*;
public class PROB42 {
    public void Perimeterofrectangle(int length, int breadth){
        int perimeter;
        perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is "+perimeter+" m");
    }
    public static void main(String[] args) {
      int l,b;
      PROB42 P42=new PROB42();
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
        P42.Perimeterofrectangle(l,b);
    }
}
