/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.Try;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Excepciones {
//    
    public static double dividirCero(int denominador)throws CustomException{
        double resultado=0;
//        try{
//            resultado =25/denominador;
//        }catch(ArithmeticException lacago){
//            System.out.println("division por cero");
//            System.out.println(lacago.getMessage());//lacago.printStaclTrace();
//        }
        if(denominador==0){
            throw new CustomException();
        }
        resultado = 25/denominador;
        return resultado;
    }
    public  double dividir(int denominador) throws CustomException{
        return this.dividirCero(denominador);
    }
    public static void main(String[] args) throws CustomException {
        Excepciones excepciones = new Excepciones();
        int denominador = 0;
        double resultado=0;
        Scanner lectura = new Scanner (System.in);
        for(int i=0;i<5;i++){
            denominador = lectura.nextInt();
            try{
                resultado= excepciones.dividir(denominador);
            }catch(CustomException lacago){
            System.out.println(lacago.getMessage());
            }
            System.out.println(resultado);
        }
        
    }
}
