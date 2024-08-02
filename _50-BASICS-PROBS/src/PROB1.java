//find the sum of two numbers.
import java.util.Scanner;

/*public class PROB1 {
    static void sum(int a, int b){
      int result= a+b;
      System.out.println("Your sum is " + result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        PROB1 P1=new PROB1();
        P1.sum(num1,num2);
    }
}*/

public class PROB1{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers sum you want ");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println("Enter "+ i + " Number");
            int value= sc.nextInt();
            sum+=value;
       }
        System.out.println("Your sum is "+ sum);
    }
}
