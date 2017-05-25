/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasEmergentes.ejemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class MessageListener implements ActionListener{
    JTextField textfield;

    public MessageListener(JTextField textfield) {
        this.textfield = textfield;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null,this.textfield.getText());
       
    }
    
}
