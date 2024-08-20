//to check if a number is a perfect number.
import java.util.*;
public class PROB14 {
    static void perfect(int number){
        int divisors=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                divisors+=i;
            }
        }
        if(divisors==number){
            System.out.println("Number is perfect");
        }else{
            System.out.println("Number is not perfect");
        }

    }
    public static void main(String[] args) {
        int value;
        PROB14 P14=new PROB14();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextInt();
        P14.perfect(value);


    }
}
