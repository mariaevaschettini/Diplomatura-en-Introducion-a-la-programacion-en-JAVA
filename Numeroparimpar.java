
/**Indicar si el numero ingresado es par o impar**/

import java.util.Scanner;

public class Numeroparimpar {
    public static void main(String args[]) {
      
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese un numero");
      
      int numero = entrada.nextInt();
      if (numero % 2 == 0){
    System.out.println ("El numero es par");
      } else {
          System.out.println("El numero es impar");
      }
    }
}
