/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjemplo3;

/**
 *
 * @author Estudiante
 */
public class Profesor extends Persona{
    protected Estudiante estudiante;

    public Profesor( String Nombre, String Direccion, int telefono) {
        super(Nombre, Direccion, telefono);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    
}
