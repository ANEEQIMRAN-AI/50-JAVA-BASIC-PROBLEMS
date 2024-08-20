//program to check if a number is a perfect square.
/*import java.util.*;
public class PROB25 {
    static void perfectsquare(int num){
        int square;
        int divisor=0;
        for (int i=2; i<num;i++){
            if(num%i==0){
                divisor=i;
            }
        }
        square=divisor*divisor;
        if(num==square){
            System.out.println("Number is Perfect square");
        }else{
            System.out.println("Number is not Perfect Square");
        }
    }
    public static void main(String[] args) {
        int value;
        PROB25 P25=new PROB25();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextInt();
        perfectsquare(value);


    }
}*/
import java.util.*;

public class PROB25 {
    static void perfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num); // Calculate the integer part of the square root
        if (sqrt * sqrt == num) {
            System.out.println("Number is a Perfect Square");
        } else {
            System.out.println("Number is not a Perfect Square");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int value = sc.nextInt();
        perfectSquare(value);
    }
}

