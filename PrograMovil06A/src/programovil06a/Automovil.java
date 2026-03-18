
package programovil06a;


public class Automovil {
     private String marca;
     private String modelo;
     private String size;
     private double precio;

    public Automovil(String marca, String modelo, String size, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.size = size;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
    
    
}
