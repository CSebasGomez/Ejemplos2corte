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
public class main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("fabian",123,33,0,100);
        Programador p1 = new Programador( 2, "Java", "valeria", 123 , 0,0,0);
        Director d1 = new Director (10,"pedro", 452,40,1,10000);
        Empresa empresa = new Empresa();
        empresa.adicionarEmpleado(e1);
        empresa.adicionarEmpleado(p1);
        empresa.adicionarEmpleado(d1);
        empresa.imprimirEmpleados();
    }
}
