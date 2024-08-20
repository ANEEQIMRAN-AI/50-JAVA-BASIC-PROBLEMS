//to find the largest among three numbers.
import java.util.*;
public class PROB23 {
    static void largestnumber(int a, int b,int c){
        if (a>b && a>c){
            System.out.println("Greater num is "+a);
        } else if(b>a && b>c){
            System.out.println("Greater num is "+b);
        } else if (c>a && c>b) {
            System.out.println("Greater num is "+c);
        }
    }

    public static void main(String[] args) {
        int value1;
        int value2;
        int value3;
        PROB23 P23=new PROB23();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        value1=sc.nextInt();
        System.out.println("Enter second number");
        value2=sc.nextInt();
        System.out.println("Enter third number");
        value3=sc.nextInt();
        largestnumber(value1,value2,value3);



    }
}
