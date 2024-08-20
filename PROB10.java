//to find the number either it is Even or Odd
import java.util.*;
public class PROB10 {
    static void evenodd(int val){
        int rem=val%2;
        if(rem==0){
            System.out.println(val+" is even");
        }else{
            System.out.println(val+" is odd");
        }
    }
    public static void main(String[] args) {
        int num;
        PROB10 P10 =new PROB10();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        P10.evenodd(num);

    }
}
