
package programovil04a;

import java.util.ArrayList;


public class PrograMovil04A {

    static ArrayList <Auto> listaAutos = new ArrayList();
   
    public static void main(String[] args) {
       Auto auto1 = new Auto("ERP-123", "FGBR12536", "Gris Metalico");
       Auto auto2 = new Auto("RTY-1205","SASEW1255SDS","Rojo");
       Auto auto3 = new Auto("YTH-5236", "RERTT1256T", 1800, "Toyota", "RAV4", "Äzul Perla");
       
        System.out.println("La placa del auto1 es: "
                +auto1.getPlaca());
        
        //Lista dinamicas
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        listaAutos.add(new Auto("TRU-6465", "TRRRRDG568UI", "Plomo"));
        listaAutos.clear();
        recorrerLista();
        
        System.out.println(""+listaAutos.contains(auto3));
        
        
        
        
    }
    
    public static void recorrerLista(){
        
        if(!listaAutos.isEmpty()){
            for(int i=0;i<listaAutos.size();i++){
            System.out.println("Auto "+(i)+": "+listaAutos.get(i).getPlaca());
        }
        }else{
            System.out.println("La lista no tiene datos!");
        }
        
        
    }
    
}
