//to check if a number is an Armstrong number.
import java.util.*;
public class PROB13 {
    static void armstrong(int number){
        int sum=0;
        int value=number;
        int num;
        int digits=String.valueOf(number).length();
        while(number !=0){
            num=number%10;
            sum+=Math.pow(num,digits);
            number /=10;
        }
        if(sum==value){
            System.out.println("number is Armstrong");
        }else{
            System.out.println("number is not Armstrong");
        }

    }
    public static void main(String[] args) {
        int value;
        PROB13 P13=new PROB13();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        value=sc.nextInt();
        P13.armstrong(value);


    }
}
