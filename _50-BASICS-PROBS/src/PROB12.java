//to check if a number is a palindrome
import java.util.*;
public class PROB12 {
    static String palindrome(String value){
        String reversed;
        String number="";
        for (int i=0; i<value.length();i++){
            number=value.charAt(i)+number;
        }
        reversed=number;
        if(reversed.equals(value)){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("number is not palindrome");
        }

        return reversed;
    }
    public static void main(String[] args) {
        String num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextLine();
        PROB12 P12=new PROB12();
        P12.palindrome(num);

    }
}
