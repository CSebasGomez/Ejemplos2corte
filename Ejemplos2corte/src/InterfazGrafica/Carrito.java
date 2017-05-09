/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
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
    private int secuencia;
    int z=0;
    
    public Image loadImage(String Fondo){
        ImageIcon fondito = new ImageIcon(Fondo);
       
        Image image = fondito.getImage();
        return image;
    }
     @Override
     
    public void actionPerformed(ActionEvent e) {
            
            if(z%2==0){
                x+=10;
                y+=2;
                if(this.secuencia ==3){
                this.secuencia=0;
                }
            else{
                this.secuencia++;
                }
                repaint();
                
                if(x==1000){
                    z++;
                }
            }
            else{
                x-=1;
                y-=2;
                if(this.secuencia ==5){
                this.secuencia=0;
                }
                else{
                this.secuencia++;
                }
                repaint();
                repaint();
                if(x==0){
                    z++;
                }
            }

//        if(checkCollisions()){
//            x+=0;
//            y-=1;
//        }
//        else{
//            x+=1;
//            y+=1;
//        }
//        x+=5;
//        y+=1;
//        if(this.secuencia ==5){
//        this.secuencia=0;
//        }
//        else{
//            this.secuencia++;
//        }
//        repaint();
    }
    

    public NewPanel2() {
        this.addMouseListener(this);
        timer = new Timer (40,this);
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);  
        
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0,null);
        
        Image Persona = loadImage("free_radical_game_sprites.png");
     
        g.drawImage(Persona,x,80,x+32,80+32,(this.secuencia*32)+32,0,32,32,this);
        
     
        Image moto = loadImage("scooter.gif");
       
        g.drawImage(moto,380,380,null);
//        Image gato = loadImage("cats.gif");
//        g.drawImage(gato,x,380,132+x,460,(this.secuencia*132),0,(this.secuencia*132)+132,80,this);
//        
        g.setColor(Color.ORANGE);
        
        g.fillRect(x,380,50 , 50);
        g.setColor(Color.GREEN);
        g.fillRect(x+40,380,60,12);
        g.setColor(Color.MAGENTA);
        g.fillOval(x+10, 430, 20, 20);
        g.fillOval(x+40, 430, 20, 20);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x,380,100,70);
        
        g.setColor(Color.ORANGE);
        
        g.drawRect(x+200,400,50 , 50);
        g.setColor(Color.GREEN);
        g.drawRect(x+40+200,400,60,12);
        g.setColor(Color.MAGENTA);
        g.drawOval(x+10+200, 450, 20, 20);
        g.drawOval(x+40+200, 450,20, 20);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x+200,400,100,70);
        
        
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
   
    public boolean checkCollisions(){
        Rectangle tanque = getBounds();
        Rectangle objeto = new Rectangle(200,450,100,70);
        if(tanque.intersects(objeto)){
            return true;
        }
        else{
            return false;
        }
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

