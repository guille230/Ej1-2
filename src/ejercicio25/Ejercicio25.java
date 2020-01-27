
 
package ejercicio25;

import java.util.Scanner;


public class Ejercicio25 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numeroReveses = "";
        System.out.println("Introduce el numero");
        String numeroas = s.nextLine();
        
        for (int i =numeroas.length()-1; i >= 0; i--) {
           numeroReveses = numeroReveses + numeroas.charAt(i);
        }
        System.err.println(numeroReveses);
    }
    
}
