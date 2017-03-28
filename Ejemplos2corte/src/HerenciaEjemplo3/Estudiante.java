/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjemplo3;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona{
    private String materia;
    private double [] notas ;
    private Profesor profesor;
    
    
                    
//                    mostrar promedio
//                            materia que cursa
//                                    profesor asignado
//                                            direccion y telefono estudiante y profesor

    public Estudiante(String materia, double[] notas, Profesor profesor, String Nombre, String Direccion, int telefono) {
        super(Nombre, Direccion, telefono);
        this.materia = materia;
        this.notas = notas;
        this.profesor = profesor;
    }
    
    public double Promedio(){
        double total=0;
        for(int i=0;i<4;i++){
            total += notas[i];
        }
        return total/4;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getMateria() {
        return materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void ImprimirInfo(){
        System.out.println(Estudiante);
    }
    @Override
    public String toString() {
        return "Estudiante{" + "materia=" + materia + ", notas=" + notas + ", profesor=" + profesor + '}'+super.toString();
    }

    
    
                                                    
}
