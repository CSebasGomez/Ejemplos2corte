/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame {
    public TestPaintComponent(){
        add(new NewPanel());
    }
    public static void main(String[] args){
        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("TestPaintComponent");
        frame.setSize(200,100);
        frame.setLocationRelativeTo(null); //Center e Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0,0, 50,50);
        g.drawString("Banner", 0,40);
    }
}

