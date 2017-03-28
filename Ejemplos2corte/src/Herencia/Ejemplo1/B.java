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
public class B extends A{
    private int b1;
    public B(int a, int b){
        super(a);
        this.b1=b;
    }
    public int getB1(){
        return b1;
    }
}
