
package programovil07a;


public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, int x, int y, String nombre) {
        super(x, y, nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        double pi = 3.1416;
        System.out.println("El area del circulo es: "+(pi*(radio*radio)));
        
        
    }
    
    
}
