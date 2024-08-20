//to find the prime number
import java.util.*;
public class PROB11 {
    static void prime(int val){
        boolean isprime=true;
        for (int i=2; i<val;i++){
            if(val%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args) {
        int num;
        PROB11 P11 =new PROB11();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        P11.prime(num);


    }
}
