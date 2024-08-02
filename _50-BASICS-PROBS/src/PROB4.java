//find the remainder when one number is divided by another
import java.util.*;
public class PROB4 {
    static void Reminder(int a, int b){
        if(a>b){
            int rem =a%b;
            System.out.println("Remainder is "+ rem);
        }else{
            System.out.println("Divisor is greater then the Dividend so the division is not possible");
        }

    }
    public static void main(String[] args) {
        int dividend;
        int divisor;
        PROB4 P4= new PROB4();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend");
        dividend=sc.nextInt();
        System.out.println("Enter Divisor");
        divisor=sc.nextInt();
        if(divisor<=0){
            System.out.println("Divisor must be greater than Zero");
        }else{
            P4.Reminder(dividend,divisor);
        }

    }
}

