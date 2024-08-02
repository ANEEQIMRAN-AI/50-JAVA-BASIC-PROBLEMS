//to find the factorial of a large number using BigInteger.
import java.math.BigInteger;
import java.util.*;
public class PROB20 {
    static BigInteger Fictorial(int num){
        BigInteger result=BigInteger.ONE;
        for (int i = 1; i<=num; i++){
            result=result.multiply(BigInteger.valueOf(i));

        }
        return result;
    }
    public static void main(String[] args) {
        int value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        value=sc.nextInt();
        System.out.println("Factorial of num is "+Fictorial(value));

    }

}
