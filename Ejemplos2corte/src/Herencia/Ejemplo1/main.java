/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Ejemplo1;

/**
 *
 * @author Estudiante
 */
public class main {
    public static void main(String[] args) {
        A a = new A(5);
    System.out.println(a.getA1());
    B b = new B(10,5);
    System.out.println(b.getA1() + " " + b.getB1());
    }
}
