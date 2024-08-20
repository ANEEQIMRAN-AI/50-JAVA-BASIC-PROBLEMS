//program to convert decimal to hexadecimal.
import java.util.*;
public class PROB34 {
    public void Decimaltohexadecimal(int number){
        StringBuilder Remainder= new StringBuilder();
        int rem;
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        while(number!=0){
            rem=number%16;
            Remainder.append(hexDigits[rem]);
            number=number/16;
        }
        String num="";
        for(int i=0; i< Remainder.length(); i++){
            num=Remainder.charAt(i)+num;
        }
        System.out.print("Number in Hexadecimal is "+num);
    }
    public static void main(String[] args) {
        int value;
        PROB34 P34=new PROB34();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal number");
        value=sc.nextInt();
        P34.Decimaltohexadecimal(value);
    }
}

