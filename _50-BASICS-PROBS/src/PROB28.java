import java.util.*;
public class PROB28 {
    public void FahrenheittoCelcius(int fahrenheit){
        double celcius;
        celcius=(fahrenheit-32)*(5.0/9.0);
        System.out.println("Temperature in Celcius is "+ celcius);

    }
    public static void main(String[] args) {
        int temperature;
        PROB28 P28 = new PROB28();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit");
        temperature=sc.nextInt();
        P28.FahrenheittoCelcius(temperature);


    }
}
