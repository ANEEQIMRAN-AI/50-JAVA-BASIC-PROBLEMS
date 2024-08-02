//program to convert decimal to octal.
import java.util.*;
public class PROB33 {
    public void Decimaltooctal(int number){
        StringBuilder Remainder= new StringBuilder();
        int rem;
        while(number!=0){
            rem=number%8;
            Remainder.append(rem);
            number=number/8;
        }
        String num="";
        for(int i=0; i< Remainder.length(); i++){
            num=Remainder.charAt(i)+num;
        }
        System.out.print("Number in octal is "+num);
    }
    public static void main(String[] args) {
        int value;
        PROB33 P33=new PROB33();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal number");
        value=sc.nextInt();
        P33.Decimaltooctal(value);
    }
}

