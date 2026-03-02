package programovil01a;

public class PrograMovil01A {

    public static void main(String[] args) {

        /*System.out.println("Salida en otra linea"); //salto de linea
        System.out.print("Salida a terminal"); //para una sola linea
        
        //tipos de datos y cadenas
        
        int edad = 15;
        boolean valor = true;
        char letra = 'c';
        
        /*
        Cadenas
         */
 /*
        String frase = "Incos Nocturno";
        System.out.println("Cantidad caracteres: "+frase.length());*/
        //ejercicio 1
        /*int dado1 = 6;
        int dado2 = 6;
        int dado3 = 6;
        int aux = 0;
        /*if((dado1 == 6)&&(dado2 == 6)&&(dado3 == 6)){
            System.out.println("Excelente!!!");
        }else if(((dado1 == 6)&&(dado2 == 6))||((dado1 == 6)&&(dado3 == 6))||((dado2 == 6)&&(dado3 == 6))){
            System.out.println("Muy Bien");
        }else if((dado1 == 6)||(dado2 == 6)||(dado3 == 6)){
            System.out.println("Regular");
        }else{
            System.out.println("Pesimo");
        }*/
        //codigo mejorado
        /*if(dado1 == 6){
            aux++;
        }
        if(dado2==6){
            aux++;
        }
        if(dado3==6){
            aux++;
        }
        if(aux == 0){
            System.out.print("pesimo");
        }else if (aux == 1){
            System.out.print("regular");
        }else if (aux == 2){
            System.out.print("bueno");
        }else if (aux == 3){
            System.out.print("exelente");
        }*/
        //ejercicio 2
        /*String frase = "Unix es un sistema";
        
        int vocales = 0;
        int consonantes = 0;
        int blanco = 0;
        
        String minusFrase = frase.toLowerCase();
        
       
        
        for (int i = 0; i<minusFrase.length(); i++) {
            char letra = minusFrase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            } else if(letra==' '){
                blanco++;
            }else{
                consonantes++;
            }
        }
        
        System.out.println("Vocales" + vocales);
        System.out.println("consonantes" + consonantes);
        System.out.println("Espacios en blanco" + blanco);

         */
        //ejercio 3
        int fila = 4;
        int col = 4;

        for (int i = 1; i <= fila; i++) {
            for (int j = 1; j <= col; j++) {

                if (j==col) {
                    System.out.print((i * j) + "");
                }else{
                    System.out.print((i * j) + "-");
                }
            }
            System.out.println("");
        }

    }

}
