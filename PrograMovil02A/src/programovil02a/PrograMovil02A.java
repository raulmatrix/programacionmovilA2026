
package programovil02a;

public class PrograMovil02A {

   
    public static void main(String[] args) {
        
        //while
        /*int valor = 7;
        while(valor<=5){
            System.out.println("Valor: "+valor);
            valor++;
        }*/
        
        //do while
        /*do{
            System.out.println("Valor: "+valor);
        }while(valor<=5);
        */
        // break y continue
        /*for(int i=0;i<10;i++){
            if(i==4){
                continue;
            }
            System.out.println(""+i);
        }*/
        
        
        //arrays
        
        /*int [] edades = {25,35,20,14,25,26,80,75};
        int edadMayor= edades[0];
        for(int i=0;i<edades.length;i++){
            if(edades[i]>edadMayor)
            {
            edadMayor = edades[i];
            }
        }
        System.out.println("la edad del mayor es:" + edadMayor);

*/
        
        System.out.println("El correo coorporativo es: "+email("raul","vera","portanda"));
        
    }
    
    public static String email(String nombre, String apellidoP, String apellidoM){
        
        String dominio = "@incosnocturno.edu.bo";   
        char inicialNomb = nombre.charAt(0);
        char inicialAM = apellidoM.charAt(0);
        
        return inicialNomb+apellidoP+inicialAM+dominio;
    }
    
    public static void saludar(){
        System.out.println("Hola Sistemas");
    }
    
}
