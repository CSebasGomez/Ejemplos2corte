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
public class Programador extends Empleado {
    protected int CodingLaneHour;
    protected String lenguaje;

    public Programador(int CodingLaneHour, String lenguaje, String Nombre, int identificacion, int edad, int EstadoCivil, double salario) {
        super(Nombre, identificacion, edad, EstadoCivil, salario);
        this.CodingLaneHour = CodingLaneHour;
        this.lenguaje = lenguaje;
    }

    public int getCodingLaneHour() {
        return CodingLaneHour;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setCodingLaneHour(int CodingLaneHour) {
        this.CodingLaneHour = CodingLaneHour;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" + "CodingLaneHour=" + CodingLaneHour + ", lenguaje=" + lenguaje + '}'+ super.toString();
    }
    
}
