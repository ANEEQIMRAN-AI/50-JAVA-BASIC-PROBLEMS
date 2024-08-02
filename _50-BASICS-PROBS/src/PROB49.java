//program to calculate the volume of a cube
import java.util.*;
public class PROB49 {
    public void Cubevolume(int side){
        int volume=side*side*side;
        System.out.println("Volume of a cube is "+volume+" meter cube");
    }
    public static void main(String[] args) {
        int value;
        PROB49 P49=new PROB49();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cube side ");
        value=sc.nextInt();
        P49.Cubevolume(value);
    }
}
