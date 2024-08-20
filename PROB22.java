//program to reverse the number
import java.util.*;
/*public class PROB22 {
    static void Reverse(String num){
        String number="";
        for (int i=0; i<num.length();i++){
            number=num.charAt(i)+number;
        }
        System.out.println("Reverse of number is "+number);

    }
    public static void main(String[] args) {
        String value;
        PROB22 P22=new PROB22();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextLine();
        P22.Reverse(value);
    }
}*/
//program to reverse a number by Integer.
public class PROB22 {
    static void reverse(int num){
        int rev=0;
        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reverse of number is "+rev);

    }
    public static void main(String[] args) {
        int value;
        PROB22 P22=new PROB22();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextInt();
        P22.reverse(value);

    }
}