//program to calculate the volume of a cone
import java.util.*;
public class PROB47 {
    public void Conevolume(int height, int radius){
        final float pi=3.147f;
        float val=height/3f;
        float volume=pi*radius*radius*val;
        System.out.println("Volume of cone is "+volume+" meter cube");
    }
    public static void main(String[] args) {
        int value1,value2;
        PROB47 P47=new PROB47();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height");
        value1=sc.nextInt();
        System.out.println("Enter radius");
        value2=sc.nextInt();
        P47.Conevolume(value1,value2);
    }
}
