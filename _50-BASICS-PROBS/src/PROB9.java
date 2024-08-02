//swap two numbers without using a temporary variable
import java.util.*;
public class PROB9 {
    static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

    }
    public static void main(String[] args) {
        int num1;
        int num2;
        PROB9 P9= new PROB9();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        P9.swap(num1,num2);



    }
}
