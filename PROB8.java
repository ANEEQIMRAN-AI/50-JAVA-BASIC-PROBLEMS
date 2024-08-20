//find the average of three numbers.
import java.util.*;
/*public class PROB8 {
    static void average(int a,int b,int c){
        int result;
        result=(a+b+c)/3;
        System.out.println("Average is "+result);

    }
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        PROB8 P8=new PROB8();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        System.out.println("Enter third number");
        num3=sc.nextInt();
        P8.average(num1,num2,num3);
    }
}*/
public class PROB8 {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int value;
        int average;
        PROB8 P8=new PROB8();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers average you want?");
        num=sc.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println("Enter" +i+ "numbers");
            value=sc.nextInt();
            sum+=value;
        }
        average=sum/num;
        System.out.println("Average is "+average);

    }
}
