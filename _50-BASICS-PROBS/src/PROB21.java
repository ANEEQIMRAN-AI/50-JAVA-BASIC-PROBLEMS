//program to find the sum of digits of a number
import java.util.*;
public class PROB21 {
    static void sum(int num){
        int sum=0;
        int number=num;
        while (num!=0){
            number=num%10;
            sum+=number;
            num=num/10;
        }
        System.out.println("Sum of digits is "+ sum);
    }

    public static void main(String[] args) {
        int value;
        PROB21 P21=new PROB21();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextInt();
        P21.sum(value);


    }
}
