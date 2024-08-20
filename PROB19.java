//program to find the roots of a quadratic equation.
import java.util.*;
public class PROB19 {
    static void roots(double a, double b, double c){
        double descriminant;
        double root1;
        double root2;
        descriminant=b*b-4*a*c;
        System.out.println(descriminant);
        if(descriminant>0){
            root1= ((-b+Math.sqrt(descriminant))/(2*a));
            root2= ((-b-Math.sqrt(descriminant))/(2*a));
            System.out.println("Root1 is "+root1);
            System.out.println("Root2 is "+root2);
        } else if (descriminant==0) {
            descriminant=0;
            root1=-b/(2*a);
            root2=root1;
            System.out.println("Root1 is "+root1);
            System.out.println("Root2 is "+root2);
        } else if (descriminant<0) {
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-descriminant)/(2*a);
            System.out.println("Root1 is "+real +" + "+ imaginary+"i");
            System.out.println("Root2 is "+real +" - "+ imaginary+"i");
        }


    }
    public static void main(String[] args) {
        int a,b,c;
        PROB19 P19 =new PROB19();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();
        System.out.println("Enter c");
        c=sc.nextInt();
        P19.roots(a,b,c);

    }
}
