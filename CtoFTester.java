/*
The functions should include the parameters Celsius or Fahrenheit,
which would be doubles. The functions should return the double value of the
temperature in either Celsius oe Fahrenheit.
*/
import java.util.Scanner;
public static double celsiusToFahrenheit(double celsius) {
  final double MULT_C_TO_F = 1.8;
  final double ADD_C_TO_F = 32;
  fahrenheit = (double) (celsius * MULT_C_TO_F + ADD_C_TO_F);
  return fahrenheit;
}
public static void main(String [] args){
  System.out.println(celsiusToFahrenheit(100));
}
