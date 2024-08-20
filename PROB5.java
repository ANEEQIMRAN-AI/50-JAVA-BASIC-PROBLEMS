//find the square of a number
import java.util.*;
public class PROB5 {
    static void Square(int a){
        int sq= a*a;
        System.out.println("Square is  "+  sq);

    }
    public static void main(String[] args) {
        int num;
        PROB5 P5 =new PROB5();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        P5.Square(num);
    }

}
