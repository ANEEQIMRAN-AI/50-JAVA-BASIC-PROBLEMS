//to find the  smaaler among three numbers.( by library and functional logic)
import java.util.*;
public class PROB24 {
    static void Smallestnumber(int a, int b, int c){
        if (a<b && a<c){
            System.out.println("Smaller num is "+a);
        } else if(b<a && b<c){
            System.out.println("Smaller num is "+b);
        } else if (c<a && c<b) {
            System.out.println("Smaller num is "+c);
        }
    }
    static void bylibrary(int a, int b, int c){
        int min=Math.min(a,b);
        min=Math.min(min,c);
        System.out.println("smaller num is "+min);
    }

    public static void main(String[] args) {
        int value1;
        int value2;
        int value3;
        PROB24 P24=new PROB24();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        value1=sc.nextInt();
        System.out.println("Enter second number");
        value2=sc.nextInt();
        System.out.println("Enter third number");
        value3=sc.nextInt();
        //Smallestnumber(value1,value2,value3);
        bylibrary(value1,value2,value3);

    }
}
