
package programovil04b;

import java.util.Scanner;

public class PrograMovil04B {

    //variable global
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while(opcion!=4){
        System.out.println("*MENU PROGRAMA*");
        System.out.println("1. Area Circulo");
        System.out.println("2. Area Cuadrado");
        System.out.println("3. Area Triangulo");
        System.out.println("4. Salir");
        
        System.out.println("Escriba una de las opciones, entre 1 - 3");
        //System.out.println("4. Salir");
        
        opcion = teclado.nextInt();
        
        if(opcion==1){
            System.out.println("Escriba el valor del radio...");
            double radio = teclado.nextDouble();
            System.out.println("El area del circulo es: "+areaCirculo(radio));
        }else if(opcion==2){
            System.out.println("Escriba el valor del lado...");
            double lado = teclado.nextDouble();
            System.out.println("El area del cuadrado es: "+areaCuadrado(lado));
        }else if(opcion==3){
            
            System.out.println("Escriba el valor de la base(puede ser decimal)");
            double base = teclado.nextDouble();
            System.out.println("Escriba el valor de la altura(puede ser decimal)");
            double altura = teclado.nextDouble();
            
            System.out.println("El area del triangulo es: "+areaTriangulo(base, altura));
            
        }else if(opcion==4){
            teclado.close();
            System.out.println("Adios!!!");
        }else{
            System.out.println("El valor introducido es erroneo, escriba un valor entre el 1 y el 3");
        }
       }
        
    }
    
    public static double areaCirculo(double radio){
        double pi = 3.1416;
        return (radio*radio)*pi;
    }
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    public static double areaCuadrado(double lado){
        return lado*lado;
    }
    
    
}
