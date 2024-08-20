//program to find the circumfrence of a circle
import java.util.*;
public class PROB36 {
    public void Circlecircumfrence(int radius){
        final float pi=3.147F;
        float circum;
        circum=2*pi*radius;
        System.out.println("Circumfrence of circle is "+circum+"m");
    }
    public static void main(String[] args) {
        int value;
        PROB36 P36 =new PROB36();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        value=sc.nextInt();
        P36.Circlecircumfrence(value);


    }
}
