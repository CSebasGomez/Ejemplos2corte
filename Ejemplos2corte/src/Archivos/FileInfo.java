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
public class FileInfo {
    public static void main(String[] args) {
        File f = new File ( "hamlet.txt");
        System.out.println("Exists returns "+f.exists());
        System.out.println("canRead "+f.canRead());
        System.out.println("lenght returns "+f.length());
        System.out.println("GetAbsolutePath returns "+f.getAbsolutePath());
    }
}
