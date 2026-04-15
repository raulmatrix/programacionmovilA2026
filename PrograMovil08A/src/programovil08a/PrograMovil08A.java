
package programovil08a;


public class PrograMovil08A {

   
    public static void main(String[] args) {
       
        Docente docente1 = new Docente(65, 50, "Ana", "Rojas", "Gonzales", 5936856, "ARG-001", 0, 100);
        Administrativo adm1 = new Administrativo("Secretaria Rector", 3000, 2014, "Emma", "Peredo", "Berrios", 56896325, "EPB-005", 0, 200);
        
        System.out.println("El sueldo del docente 1 es: "+docente1.calcularSueldo());
        System.out.println("El sueldo del administrativo 1 es: "+adm1.calcularSueldo());
    }
    
}
