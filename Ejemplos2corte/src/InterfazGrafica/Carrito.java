/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Carrito extends JFrame {
    
    public Carrito(){
        add(new NewPanel2());
    }
    public static void main(String[] args){
        Carrito frame = new Carrito();
        frame.setTitle("Carrito");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null); //Center e Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

   
}
class NewPanel2 extends JPanel implements ActionListener,MouseListener{
    private int x=20;
    private int y=8;
    private Timer timer;
    int z=0;
     @Override
     
    public void actionPerformed(ActionEvent e) {
            
            if(z%2==0){
                x+=20;
                y+=5;
                repaint();
                if(x==1000){
                    z++;
                }
            }
            else{
                x-=20;
                y-=5;
                repaint();
                if(x==0){
                    z++;
                }
            }
    }
    

    public NewPanel2() {
        this.addMouseListener(this);
        timer = new Timer (5,this);
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.ORANGE);
        
        g.drawRect(x,450,50 , 50);
        g.setColor(Color.GREEN);
        g.drawRect(x+40,460,60,12);
        g.setColor(Color.MAGENTA);
        g.drawOval(x+10, 500, 20, 20);
        g.drawOval(x+40, 500, 20, 20);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x,450,100,70);
        
        g.setColor(Color.ORANGE);
        
        g.drawRect(x+200,450,50 , 50);
        g.setColor(Color.GREEN);
        g.drawRect(x+40+200,460,60,12);
        g.setColor(Color.MAGENTA);
        g.drawOval(x+10+200, 500, 20, 20);
        g.drawOval(x+40+200, 500, 20, 20);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x+200,450,100,70);
        
        
        g.setColor(Color.red);
        g.drawRoundRect(60, y, 40, 60, 30, 15);
        
        g.setColor(Color.red);
        g.drawRoundRect(60+120, y, 40, 60, 30, 15);
        
        g.setColor(Color.darkGray);
        g.drawOval(250, y, 70, 70);
        
        g.setColor(Color.darkGray);
        g.drawOval(250, y+80, 70, 70);
    }
    public Rectangle getBounds(){
        return new Rectangle(x,450,100,70);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Soy el puto amo");
        Point mp =e.getPoint();
        if(getBounds().contains(mp)){
            timer.stop();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}

