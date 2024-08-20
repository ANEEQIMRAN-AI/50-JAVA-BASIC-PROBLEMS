//program to calculate the power of a number using recursion.
import java.util.*;
public class PROB26 {
    static int power(int Number,int Exponent){
        while (Exponent>0){
            return Number*power(Number,Exponent-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        int value1;
        int value2;
        PROB26 P26 =new PROB26();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        value1=sc.nextInt();
        System.out.println("Enter Exponent");
        value2=sc.nextInt();
        System.out.println("The power of number is "+P26.power(value1,value2));


    }
}
