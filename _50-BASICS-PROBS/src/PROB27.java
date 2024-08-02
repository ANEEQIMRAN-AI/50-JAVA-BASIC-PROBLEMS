//. Write a Java program to convert Celsius to Fahrenheit
import java.util.*;
public class PROB27 {
    public void CelciustoFahrenheit(int celcius){
        double Fahrenheit;
        Fahrenheit=(9.0/5.0*celcius)+32;
        System.out.println("Temperature in Fahrenheit is "+ Fahrenheit);

    }
    public static void main(String[] args) {
        int temperature;
        PROB27 P27=new PROB27();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius");
        temperature=sc.nextInt();
        P27.CelciustoFahrenheit(temperature);

    }
}
