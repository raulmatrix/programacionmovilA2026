
package programovil08a;


public class Administrativo extends EmpleadosUniversidad{
    private String cargo;
    private double sueldoBasico;
    private int añoIngreso;

    public Administrativo(String cargo, double sueldoBasico, int añoIngreso, String nombres, String apePat, String apeMat, int carnet, String codEmpleado, double bono, double descuento) {
        super(nombres, apePat, apeMat, carnet, codEmpleado, bono, descuento);
        this.cargo = cargo;
        this.sueldoBasico = sueldoBasico;
        this.añoIngreso = añoIngreso;
    }

   

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
    public double calcularSueldo(){
        return sueldoBasico-getDescuento()+ bonoAntiguedad();
    }
    
    public double bonoAntiguedad(){
        int cantAños = 2026 - añoIngreso;
        double monto;
        if(cantAños>15){
            monto = sueldoBasico * 0.10;
        }else if(cantAños>10){
            monto = sueldoBasico * 0.05;
        }else if(cantAños>5){
            monto = sueldoBasico * 0.02;
        }else{
        monto = 0;
        }
        return monto;
    }
}
