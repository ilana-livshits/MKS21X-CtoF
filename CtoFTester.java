/*
The functions should include the parameters Celsius or Fahrenheit,
which would be doubles. The functions should return the double value of the
temperature in either Celsius oe Fahrenheit.
*/
public class CtoFTester {
public static double celsiusToFahrenheit(double celsius) {
  return (celsius * 1.8 + 32);
}

public static double FahrenheitToCelsius(double fahrenheit) {
  return ((fahrenheit - 32) * 5/9 );
}

public static void main(String[] args){
  System.out.println(celsiusToFahrenheit(100.0));
  System.out.println(FahrenheitToCelsius(32.0));
}
}
