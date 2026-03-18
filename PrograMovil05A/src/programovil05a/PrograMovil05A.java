
package programovil05a;

import java.util.Scanner;


public class PrograMovil05A {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar una opcion: \n1. Insertar heroe \n2.Salir");
        int opcion = teclado.nextInt();
        
        while(opcion!=2){
            System.out.println("Ingresar datos del heroe");
            System.out.println("Ingrese el nombre");
            String nombreHeroe = teclado.nextLine();
            System.out.println("Ingrese el tipo heroe:");
            System.out.println("1.Volador");
            System.out.println("2.Fuerza");
            System.out.println("3.Magico");
            String tipo = teclado.nextLine();
            System.out.println("Escriba el nivel de poder: esto en el rango de 1 - 5");
            int nivel = teclado.nextInt();
        
            //instanciar el objeto

            Heroe heroe = new Heroe(nombreHeroe, tipo, nivel);

            heroe.mostrarDatos();
        
        }
        
        
    }
    
}
