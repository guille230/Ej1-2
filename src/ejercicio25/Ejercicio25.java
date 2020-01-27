
 
package ejercicio25;

import java.util.Scanner;


public class Ejercicio25 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numeroReves = "";
        System.out.println("Introduce el numero");
        String numero = s.nextLine();
        
        for (int i =numero.length()-1; i >= 0; i--) {
           numeroReves = numeroReves + numero.charAt(i);
        }
        System.err.println(numeroReves);
    }
    
}
