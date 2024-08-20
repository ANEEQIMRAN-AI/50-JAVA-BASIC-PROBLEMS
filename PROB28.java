// to conert the temperature from fahrenheight to celcius
import java.util.*;
public class PROB28 {
    public void FahrenheittoCelcius(float fahrenheit){
        double celcius;
        celcius=(fahrenheit-32)*(5.0/9.0);
        System.out.println("Temperature in Celcius is "+ celcius);

    }
    public static void main(String[] args) {
        float temperature;
        PROB28 P28 = new PROB28();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit");
        temperature=sc.nextFloat();
        P28.FahrenheittoCelcius(temperature);


    }
}
