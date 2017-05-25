/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasEmergentes.ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ekemplo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Cual es tu nombre ?");
        
        int choice = JOptionPane.showConfirmDialog(null, " Te gusta el pastel, "+ name + "?");
        if ( choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, " Por supuesto, a quien no le gusta el pastel ?");
        }
        else{
            JOptionPane.showMessageDialog(null,"Odio rotundo a usted");
        }
    }
}
