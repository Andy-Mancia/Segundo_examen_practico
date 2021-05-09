
package exaprac2;

/**
ACA UBICO MIS CLASES
 */
public class Datos_trabajadores {
    private String nombre_empleado;
    private double salario_por_hora;
    private int cantidad_horas_trabajadas;
    
    //AGREGO MI CONSTRUCTOR 

    public Datos_trabajadores() {
    }
    
        public Datos_trabajadores(String nombre_empleado, double salario_por_hora, int cantidad_horas_trabajadas) {
        this.nombre_empleado = nombre_empleado;
        this.salario_por_hora = salario_por_hora;
        this.cantidad_horas_trabajadas = cantidad_horas_trabajadas;
    }
    
    //CON SUS RESPECTIVOS GET Y SET

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public double getSalario_por_hora() {
        return salario_por_hora;
    }

    public void setSalario_por_hora(double salario_por_hora) {
        this.salario_por_hora = salario_por_hora;
    }

    public int getCantidad_horas_trabajadas() {
        return cantidad_horas_trabajadas;
    }

    public void setCantidad_horas_trabajadas(int cantidad_horas_trabajadas) {
        this.cantidad_horas_trabajadas = cantidad_horas_trabajadas;
    }
        
    public double sumarSalario(){
        double salario;
        salario = salario_por_hora * cantidad_horas_trabajadas;
        return salario;
    }
    
}
