
package programovil06a;

import java.util.ArrayList;
import java.util.Scanner;


public class PrograMovil06A {

    static ArrayList<Automovil> listaAutos = new ArrayList();
    static int posicion = -1;  
    
    public static void main(String[] args) {
        
        listaAutos.add(new Automovil("Suzuki", "alto", "pequeño", 1000));//0
        listaAutos.add(new Automovil("Toyota", "RAV4", "mediano", 1000));//1
        listaAutos.add(new Automovil("Toyota", "Tundra", "mediano", 1000));//2
        listaAutos.add(new Automovil("Volvo", "Volvo", "grande", 1000));//3
        listaAutos.add(new Automovil("Mercedes Benz", "MB", "grande", 1000));//4
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("***REGISTRO AUTOMOVILES*****");
        System.out.println("1. Insertar automovil \n2.Mostrar Registros \n0.Salir");
        int opcion = teclado.nextInt();
        //insertar
        if(opcion==1){
            System.out.println("Registre la marca");
            String marca = teclado.next();
            System.out.println("Registre la modelo");
            String modelo = teclado.next();
            System.out.println("Registre el tamaño");
            String size = teclado.next();
            System.out.println("Registre el precio");
            double precio = teclado.nextDouble();
            //creamos el objeto con los valores ingresados
            Automovil auto = new Automovil(marca, modelo, size, precio);
            
            if(size.equals("pequeño")){
                listaAutos.add(0, auto);
            }else if(size.equals("mediano")){
                posicion = devolverPosicion("mediano");
                listaAutos.add(posicion, auto);
            }else if(size.equals("grande")){
                posicion = devolverPosicion("grande");
                listaAutos.add(posicion, auto);
            }else{
                System.out.println("Escriba un valor entre 1 - 3");
            }
            
            
            mostrarLista();
        }
        
    }
    
    public static void mostrarLista(){
        for(int i=0;i<listaAutos.size();i++){
            System.out.println("Posicion "+i
                    +" Modelo: "+listaAutos.get(i).getModelo()
                    +" Tamaño"+listaAutos.get(i).getSize());
        }
    }
    
    public static int devolverPosicion(String size){
        int valor = 0;
        for(int i=0;i<listaAutos.size();i++){
            if(size.equals(listaAutos.get(i).getSize())){
                valor = i-1;
               
            }
        }
        return valor;
    }
    
}
