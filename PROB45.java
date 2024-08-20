//program to find the volume of a cylinder
import java.util.*;
public class PROB45 {
    public void Cylindervolume(int height, int radius){
        final float pi=3.147F;
        float volume;
        volume=pi*height*radius*radius;
        System.out.println("Volume of cylinder is "+volume+" meter cube");
    }
    public static void main(String[] args) {
        int value1;
        int value2;
        PROB45 P45=new PROB45();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height");
        value1=sc.nextInt();
        System.out.println("Enter radius");
        value2=sc.nextInt();
        P45.Cylindervolume(value1,value2);

    }
}
