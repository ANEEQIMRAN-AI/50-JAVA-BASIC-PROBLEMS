//to find the Fabonacii Series
import java.util.*;
public class PROB15 {
    static void fabonacci(int num){
        int firstvalue,secondvalue;
        firstvalue=0;
        secondvalue=1;
        for (int i=1; i<=num;i++){
            System.out.println(firstvalue);
            int nextvalue=firstvalue+secondvalue;
            firstvalue=secondvalue;
            secondvalue=nextvalue;
        }


    }
    public static void main(String[] args) {
        int value;
        PROB15 P15=new PROB15();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        value=sc.nextInt();
        P15.fabonacci(value);
    }
}
