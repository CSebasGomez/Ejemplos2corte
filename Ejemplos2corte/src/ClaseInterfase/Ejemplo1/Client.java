/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInterfase.Ejemplo1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Client {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String email;
    private ArrayList<Asset> assets;

    public Client(String nombre, String apellido, String telefono, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.assets = new ArrayList<Asset>();
        
    }

    public void addAsset(Asset asset){
        this.assets.add(asset);
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }
    
    
}
