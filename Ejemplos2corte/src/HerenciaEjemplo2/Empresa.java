/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjemplo2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    public void adicionarEmpleado ( Empleado empleado){
        this.empleados.add(empleado);
    }
    public void imprimirEmpleados(){
        for ( Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }
}
