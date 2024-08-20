//find the cube of a number.
import java.util.*;
public class PROB6  {
    static void cube (int c){
        int result=c*c*c;
        System.out.println("Cube is "+ result);
    }
    public static void main(String[] args) {
        int num;
        PROB6 P6 =new PROB6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        P6.cube(num);


    }
}
