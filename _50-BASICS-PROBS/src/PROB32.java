//program to convert decimal to binary.
import java.util.*;
public class PROB32 {
    public void Decimaltobinary(int number){
        StringBuilder Remainder= new StringBuilder();
        int rem;
        while(number!=0){
            rem=number%2;
            Remainder.append(rem);
            number=number/2;
        }
         String num="";
        for(int i=0; i< Remainder.length(); i++){
            num=Remainder.charAt(i)+num;
        }
        System.out.print("Number in Binary is "+num);
    }
    public static void main(String[] args) {
        int value;
        PROB32 P32=new PROB32();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal number");
        value=sc.nextInt();
        P32.Decimaltobinary(value);
    }
}
