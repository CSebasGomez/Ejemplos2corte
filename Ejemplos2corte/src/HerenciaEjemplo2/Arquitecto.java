/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjemplo2;

/**
 *
 * @author Estudiante
 */
public class Arquitecto extends Empleado {
    protected int cantidadProyectos;

    public Arquitecto(int cantidadProyectos, String Nombre, int identificacion, int edad, int EstadoCivil, double salario) {
        super(Nombre, identificacion, edad, EstadoCivil, salario);
        this.cantidadProyectos = cantidadProyectos;
    }

    public int getCantidadProyectos() {
        return cantidadProyectos;
    }

    public void setCantidadProyectos(int cantidadProyectos) {
        this.cantidadProyectos = cantidadProyectos;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "cantidadProyectos=" + cantidadProyectos + '}'+ super.toString();
    }
    
}
