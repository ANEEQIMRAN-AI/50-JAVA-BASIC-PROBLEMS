//program to convert octal to decimal
import java.util.*;
public class PROB30 {
    public void octaltodecimal(int octal){
        int sum=0;
        int rem;
        int number=octal;
        for(int i=0; i<number; i++){
            rem=number%10;
            sum+=rem*Math.pow(8,i);
            number=number/10;
        }
        System.out.println("Decimal number is "+sum);

    }
    public static void main(String[] args) {
        int number;
        PROB30 P30 =new PROB30();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Octal number");
        number=sc.nextInt();
        P30.octaltodecimal(number);

    }
}
