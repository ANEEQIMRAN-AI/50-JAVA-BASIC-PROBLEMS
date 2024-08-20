// Method to calculate GCD
import java.util.*;
public class PROB16 {
        static int GCD(int a, int b) {
            int gcd=1;
            int min;
            min=Math.min(a,b);
            for (int i=1; i<=min;i++){
                if (a%i==0 && b%i==0){
                    gcd=i;
                }

           }
            return gcd;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();
            PROB16 P16=new PROB16();
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " +P16.GCD(num1, num2) );
        }

}
