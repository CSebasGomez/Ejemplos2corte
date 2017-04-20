/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.Try;

/**
 *
 * @author Estudiante
 */
public class Test1 {
    public void Test1(){
        DivideByZero();
    }
    public double DivideByZero(){
        double result=0;
        try{
            result=25/0;
        }catch(ArithmeticException lacago){
            System.out.println("No es posible dividir por cero");
        }
        return result;
    }
}
