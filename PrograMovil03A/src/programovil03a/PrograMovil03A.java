
package programovil03a;

import java.util.Scanner;


public class PrograMovil03A {

    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //instancia scanner
        
       /* 
        System.out.println("Cual es su nombre??");
        String nombrePersona = teclado.nextLine();
        
        System.out.println("Cual es su año de nacimiento??");
        int nacimiento = teclado.nextInt();
        
        
        System.out.println("Usted "+ nombrePersona+" tiene: "+(2026-nacimiento)+" años");
        */
       int opcion = 0;
       double area = 0;
       do{
       
           
           System.out.println("Elija una opcion para calcular el area");
           System.out.println("1. Triangulo");
           System.out.println("2. Cuadrado");
           System.out.println("3. Circulo");
           System.out.println("4. Salir");
           int opcionElegida = teclado.nextInt();
           if(opcionElegida==1){
               int base = 0;
               int altura = 0;
               area = base * altura;
           }
       }while(opcion!=4);
        
    }
    
    public double areaTriangulo(int base, int altura){
        return base*altura;
    }
    
}
