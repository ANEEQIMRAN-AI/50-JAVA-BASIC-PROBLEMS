//find the product of two numbers.
import java.util.*;
/*public class PROB2 {
    static void product(int a, int b){
        int result=a*b;
        System.out.println("Product is " + result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        PROB2 P2=new PROB2();
        P2.product(num1,num2);
    }
}*/
public class PROB2 {
    public static void main(String[] args) {
        int product=1;
        int value;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers product you want");
        int num=sc.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println("Enter "+i+ " Number");
            value=sc.nextInt();
            product*=value;
        }
        System.out.println("Your product is "+ product);
    }
}
