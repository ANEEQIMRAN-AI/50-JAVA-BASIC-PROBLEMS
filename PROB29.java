//program to convert binary to decimal
import java.util.*;
public class PROB29 {
    public void bintodecimal(int binary){
        int sum=0;
        int rem;
        int number=binary;
        int length=String.valueOf(number).length();
        for (int i=0; i<length; i++){
            rem=number%10;
            sum+=rem*Math.pow(2,i);
            number=number/10;
        }
        System.out.println("Number in Decimal is "+ sum);

    }

    public static void main(String[] args) {
        int num;
        PROB29 P29=new PROB29();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary number");
        num=sc.nextInt();
        P29.bintodecimal(num);


    }
}
