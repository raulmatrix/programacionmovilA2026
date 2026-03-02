
package programovil03b;

import java.util.Scanner;


public class PrograMovil03B {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escriba su nombre completo");
        String nombre = teclado.nextLine();
        
        System.out.println("Escriba el año de su nacimiento");
         int year = teclado.nextInt();
         
         System.out.println(nombre+" su edad es: "+(2026-year));
    }
    
}
