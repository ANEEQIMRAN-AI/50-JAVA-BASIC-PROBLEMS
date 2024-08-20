// find the quotient when one number is divided by another.
import java.util.*;
public class PROB3 {
    static void quotient(int a,int b){
        if(a>b){
            float result=(float) a/b;
            System.out.println("Your Quotient is "+ result);
        }else{
            System.out.println("Divisor is greater then the Dividend so the division is not possible");
        }
    }
    public static void main(String[] args) {
        int dividend;
        int divisor;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Dividend");
        dividend=sc.nextInt();
        System.out.println("Enter the Divisor");
        divisor=sc.nextInt();
        PROB3 P3=new PROB3();
        if(divisor<=0){
            System.out.println("Divisor must be greater then Zero");
        }else{
            P3.quotient(dividend,divisor);

        }

    }
}
