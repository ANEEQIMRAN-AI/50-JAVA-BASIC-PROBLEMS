//find the factorial of a number.
import java.util.*;
/*public class PROB7 {
    static void factorial(int num){
        int fact=1;
        if(num==0){
            System.out.println("Factorial is "+fact);

        } else if (num<0) {
            System.out.println("Factorial of negative number does not exist");

        }else{
            for (int i=num;i>=1;i--){
            fact*=i;
            }
            System.out.println("Factorial is "+ fact);
        }

    }
    public static void main(String[] args) {
        int value;
        PROB7 P7=new PROB7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        value=sc.nextInt();
        P7.factorial(value);
    }
}*/

//Factorial through Recursion
public class PROB7 {
    static int factorial(int k){;
        if(k>0){
            return k*factorial(k-1);

        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int result;
        int value;
        PROB7 P7=new PROB7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        value=sc.nextInt();
        result=P7.factorial(value);
        System.out.println("Fcatorial is "+result);
    }
}

