
package programovil05b;

public class PrograMovil05B {

 
    public static void main(String[] args) {
       
        String frase = "Esta-es-un-10-de-15";
        String [] particion = frase.split("-");
        int valor1 = Integer.parseInt(particion[3]);
        int valor2 = Integer.parseInt(particion[5]);
        
        System.out.println("El valor de la posicion 3 mas "
                + "el valor de la posicion 5 es:es: "
                +(valor1+valor2));
        
    }
    
}
