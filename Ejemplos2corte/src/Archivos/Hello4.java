/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class Hello4 {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintStream output= new PrintStream(new File("hamlet.txt"));
//        output.println("Hello world.");
//        output.println();
//        output.print("This program produces 4");
//        output.println("lines of output.");
         File f = new File("hamlet.txt");
         //f.delete();
         f.createNewFile();
         
    }
}
