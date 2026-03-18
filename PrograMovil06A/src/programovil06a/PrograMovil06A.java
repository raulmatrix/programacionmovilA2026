
package programovil06a;

import java.util.ArrayList;
import java.util.Scanner;


public class PrograMovil06A {

    static ArrayList<Automovil> listaAutos = new ArrayList();
    
    
    
    public static void main(String[] args) {
        listaAutos.add(new Automovil("Suzuki", "alto", "pequeño", 1000));//0
        listaAutos.add(new Automovil("Toyota", "RAV4", "mediano", 1000));//1
        listaAutos.add(new Automovil("Toyota", "Tundra", "mediano", 1000));//2
        listaAutos.add(new Automovil("Volvo", "Volvo", "grande", 1000));//3
        listaAutos.add(new Automovil("Mercedes Benz", "MB", "grande", 1000));//4
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("***REGISTRO AUTOMOVILES*****");
        System.out.println("1. Insertar automovil \n2.Mostrar Registros \n3.Salir");
        int opcion = teclado.nextInt();
        //insertar
        if(opcion==1){
            System.out.println("Registre la marca");
            String marca = teclado.nextLine();
            System.out.println("Registre la modelo");
            String modelo = teclado.nextLine();
            System.out.println("Registre el tamaño");
            String size = teclado.nextLine();
            System.out.println("Registre el precio");
            double precio = teclado.nextDouble();
            //creamos el objeto con los valores ingresados
            Automovil auto = new Automovil(marca, modelo, size, precio);
            
            //listaAutos.add(auto);
            listaAutos.add(2, auto);
            
            mostrarLista();
        }
        else if(opcion==2){
        }
        else if(opcion==3){
        }
        else{
            System.out.println("Escriba un valor entre 1 - 3");
        }
    }
    
    public static void mostrarLista(){
        for(int i=0;i<listaAutos.size();i++){
            System.out.println("Posicion "+i
                    +" Modelo: "+listaAutos.get(i).getModelo()
                    +" Tamaño"+listaAutos.get(i).getSize());
        }
    }
    
}
