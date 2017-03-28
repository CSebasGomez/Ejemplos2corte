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
public class main {
    //-Crear un objeto de la clase estudiante , incluyendo que profesor tiene asignado
    public static void main(String[] args) {
        java.util.Scanner a;
        a= new java.util.Scanner (System.in);
        System.out.println("Ingrese la materia que estudia el estudiante");
        String materia= a.next();
        double[] notas = new double[4];
        for(int i=0;i<4;i++){
            System.out.println("Ingrese la nota " + i+1+"del estudiante");
            notas[i] = a.nextDouble();
        }
        System.out.println("Ingrese el nombre del profesor");
        String NombreProfesor = a.next();
        System.out.println("Ingrese la direccion del profesor");
        String DireccionProfesor = a.next();
        System.out.println("Ingrese el telefono del profesor");
        int TelefonoProfesor = a.nextInt();
        System.out.println("Ingrese el nombre del estudiante");
        String NombreEstudiante = a.next();
        System.out.println("Ingrese la direccion del estudiante");
        String DireccionEstudiante = a.next();
        System.out.println("Ingrese el Telefono del estudiante");
        int TelefonoEstudiante = a.nextInt();
        Profesor Fabian = new Profesor(NombreProfesor,DireccionProfesor,TelefonoProfesor);
        Estudiante Nick = new Estudiante(materia,notas,Fabian,NombreEstudiante,DireccionEstudiante,TelefonoEstudiante);
        
        
        
    }
}
