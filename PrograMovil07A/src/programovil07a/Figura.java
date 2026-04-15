
package programovil07a;

/**
 *Clase Padre
 */
public class Figura {
    private int x;
    private int y;
    private String nombre;
    private String valor;

    public Figura(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void calcularArea(){
        System.out.println("No se calcular mi area");
    }
    
}
