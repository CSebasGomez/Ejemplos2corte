/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasEmergentes.ejemplo;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Estudiante
 */
public class SimpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    
    Image icon = Toolkit.getDefaultToolkit().getImage("Pikachu 2.png");
    frame.setIconImage(icon);
    JPanel panel = (JPanel) frame.getContentPane();// obteniendo el frame del panel , todo panel tiene un frame por defecto
    panel.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize( new Dimension(300,120));
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
    frame.setTitle("Pokemon");
    frame.setVisible(true);
    }
  
}
