//program to convert hexadecimal to decimal.
import java.util.*;
public class PROB31 {
    public void hexatodecimal(int hexadecimal){
        int sum=0;
        int rem;
        int number=hexadecimal;
        for (int i=0; i<number; i++){
            rem=number%10;
            sum+=rem*Math.pow(16,i);
            number=number/10;
        }
        System.out.println("Number in Decimal is "+sum);
    }
    public static void main(String[] args) {
        int value;
        PROB31 P31 =new PROB31();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hexadecimal number");
        value=sc.nextInt();
        P31.hexatodecimal(value);


    }
}
