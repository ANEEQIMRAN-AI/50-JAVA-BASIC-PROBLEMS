// Subtract two numbers
import java.util.*;
public class PROB17 {
    static void sub(int num1,int num2){
        int result;
        result=num1-num2;
        System.out.println("Subtraction is "+Math.abs(result));
    }
    public static void main(String[] args) {
        int value1;
        int value2;
        PROB17 P17=new PROB17();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        value1=sc.nextInt();
        System.out.println("Enter Second number");
        value2=sc.nextInt();
        sub(value1,value2);
    }
}

