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
public class Persona {
    protected String Nombre;
    protected String Direccion;
    protected int telefono;

    public Persona(String Nombre, String Direccion, int telefono) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", telefono=" + telefono + '}';
    }
    
}
