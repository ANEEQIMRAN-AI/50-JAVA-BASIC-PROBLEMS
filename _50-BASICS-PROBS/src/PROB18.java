//program to find the LCM (Least Common Multiple) of two numbers.
import java.util.*;
public class PROB18 {
    static int GCD(int a,int b){
        int gcd=1;
        int min;
        min=Math.min(a,b);
        for (int i=1; i<=min; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
    static void LCM(int a,int b){
        int lcm;
        lcm=Math.abs(a*b)/GCD(a,b);
        System.out.println("LCM IS "+ lcm);
    }

    public static void main(String[] args) {
        int value1;
        int value2;
        PROB18 P18=new PROB18();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        value1=sc.nextInt();
        System.out.println("Enter first number");
        value2=sc.nextInt();
        P18.LCM(value1,value2);
    }
}

