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
public class Empleado {
    protected String Nombre;
    protected int identificacion;
    protected int edad;
    protected int EstadoCivil;
    protected double salario;

    public Empleado(String Nombre, int identificacion, int edad, int EstadoCivil, double salario) {
        this.Nombre = Nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.EstadoCivil = EstadoCivil;
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstadoCivil() {
        return EstadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(int EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", identificacion=" + identificacion + ", edad=" + edad + ", EstadoCivil=" + EstadoCivil + ", salario=" + salario + '}';
    }
    
                         
}
