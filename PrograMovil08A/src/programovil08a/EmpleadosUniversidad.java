
package programovil08a;

public class EmpleadosUniversidad {
    
    private String nombres;
    private String apePat;
    private String apeMat;
    private int carnet;
    private String codEmpleado;
    private double bono;
    private double descuento;

    public EmpleadosUniversidad(String nombres, String apePat, String apeMat, int carnet, String codEmpleado, double bono, double descuento) {
        this.nombres = nombres;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.carnet = carnet;
        this.codEmpleado = codEmpleado;
        this.bono = bono;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    public double calcularSueldo(){
        return 0;
    }
    
}
