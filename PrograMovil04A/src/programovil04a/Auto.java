
package programovil04a;

public class Auto {
    //atributos
     private String placa;
     private String chasis;
     private int cilindrada;
     private String marca;
     private String modelo;
     private String color;
    
    //metodos
    //metodo constructor

    public Auto(String placa, String chasis, String color) {
        this.placa = placa;
        this.chasis = chasis;
        this.color = color;
    }
    
    public Auto(String placa, String chasis, int cilindrada, String marca, String modelo, String color) {
        this.placa = placa;
        this.chasis = chasis;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    //metodos get y set

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        
        mostrarDatos();
    }
    
    public void mostrarDatos(){
        System.out.println("datos");
    }
    
    
    
}
