
 
package ejercicio25;

import java.util.Scanner;


public class Ejercicio25 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numeroRevese = "";
        System.out.println("Introduce el numero");
        String numeroa = s.nextLine();
        
        for (int i =numeroa.length()-1; i >= 0; i--) {
           numeroRevese = numeroRevese + numeroa.charAt(i);
        }
        System.err.println(numeroRevese);
    }
    
}
