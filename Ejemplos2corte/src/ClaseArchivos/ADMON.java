/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseArchivos;

/**
 *
 * @author Estudiante
 */
public class ADMON extends Empleado{

    public ADMON(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public double CalcularSalario() {
        return 200;
    }

    @Override
    public String mostrarInformacion() {
        return "ADMON "+ this.nombre+" "+this.id;
    }
    
}
