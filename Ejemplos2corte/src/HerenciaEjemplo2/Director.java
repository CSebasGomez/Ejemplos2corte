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
public class Director extends Empleado {
    protected int AñosExperiencia;

    public Director(int AñosExperiencia, String Nombre, int identificacion, int edad, int EstadoCivil, double salario) {
        super(Nombre, identificacion, edad, EstadoCivil, salario);
        this.AñosExperiencia = AñosExperiencia;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    @Override
    public String toString() {
        return "Director{" + "A\u00f1osExperiencia=" + AñosExperiencia + '}'+ super.toString();
    }
    
}
