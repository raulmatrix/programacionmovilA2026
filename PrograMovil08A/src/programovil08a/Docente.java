
package programovil08a;


public class Docente extends EmpleadosUniversidad{
    
    
    private String materias;
    private double pagoHora;
    private double cantHoras;

    public Docente(double pagoHora, double cantHoras, String nombres, String apePat, String apeMat, int carnet, String codEmpleado, double bono, double descuento) {
        super(nombres, apePat, apeMat, carnet, codEmpleado, bono, descuento);
        //this.materias = materias;
        this.pagoHora = pagoHora;
        this.cantHoras = cantHoras;
    }

    public double getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(double cantHoras) {
        this.cantHoras = cantHoras;
    }


    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    @Override
    public double calcularSueldo(){
        
        return (pagoHora*cantHoras)-getDescuento()+bonoDocente();
    
    }
    
    public double bonoDocente(){
        double monto = 0;
        if(cantHoras>60){
            monto = 800;
        }else if(cantHoras>30){
            monto = 650;
        }else if(cantHoras>20){
            monto = 500;
        }else{
            monto = 0;
        }
        return monto;
    }
    
    
}
