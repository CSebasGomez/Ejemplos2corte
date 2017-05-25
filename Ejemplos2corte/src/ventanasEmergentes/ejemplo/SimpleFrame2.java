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
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel ( "Cual es su color favorito?");
        frame.add(label);
        JTextField field = new JTextField(4);
        frame.add(field);

        frame.setTitle("Pokemon");
        JButton button1= new JButton();
        button1.setText("Red Team");
        button1.setBackground(Color.RED);
        frame.add(button1); // add agrega objetos al frame
        JButton button2 = new JButton();
        button2.setText("Blue Team");
        button2.setBackground(Color.BLUE);
        frame.add(button2);
        frame.setVisible(true);

        JFrame frame2 = new JFrame();
        Image icon2 = Toolkit.getDefaultToolkit().getImage("Pikachu 2.png");
        frame2.setIconImage(icon);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize( new Dimension(300,250));
        JPanel centerPanel= new JPanel ( new GridLayout(4,3));
        for(int i =1;i<=9;i++){
            centerPanel.add(new JButton(" "+ i));
        }
        centerPanel.add(new JButton( "*"));
        centerPanel.add(new JButton( "0"));
        centerPanel.add(new JButton( "#"));
        frame2.add(centerPanel);
        
        JPanel southPanel = new JPanel( new FlowLayout());
        southPanel.add( new JLabel(" Digite su promedio a llorar"));
        southPanel.add(new JTextField(10));
        frame2.add(southPanel,BorderLayout.SOUTH);
        frame2.setVisible(true);
        button1.addActionListener(new MessageListener(field));
    }
  
}
