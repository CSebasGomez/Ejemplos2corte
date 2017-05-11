/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUEGOTESOFLASH;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class main extends JFrame{
    public main(){
        add(new RicoPanelita());
    }
    public static void main(String[] args){
        main frame = new main();
        frame.setTitle("JUEGO FLASH");
        frame.setSize(1024,512);
        frame.setLocationRelativeTo(null); //Center e Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
class RicoPanelita extends JPanel implements  ActionListener,MouseListener{
    private int a=0;
    private int b=0;
    private int z=0;
    private Timer timer;
    
    public RicoPanelita(){
        this.addMouseListener(this);
        addKeyListener(new TAdapter());
        setFocusable(true);
        timer = new Timer (20,this);
        timer.start();
    }
    public Image loadImage(String Figura){
        ImageIcon figura = new ImageIcon(Figura);
       
        Image image = figura.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (z%2==0){
            a+=1;
            if(a==1024){
                z++;
            }
        }
        else{
            a-=1;
            if(a==0){
                z++;
            }
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Image Fondo = loadImage ("blue_background.png");
        for(int i=0;i<48;i++){
            g.drawImage(Fondo, i*(22), 0, this);
        }
        Image tierra1 = loadImage("ground_single.png");
        for(int i=0;i<10;i++){
            g.drawImage(tierra1, i*(110), 512-68, this);
        }
        Image nubes = loadImage("clouds.png");
        for(int j=0;j<2;j++){
            for(int i=0;i<7;i++){
                g.drawImage(nubes, i*(335), 100, this);
            }
        }
        Image enemigo1 = loadImage("enemy_run.png");
//        Image enemigo2 = loadImage("enemy_standing.png");
        if(a%2==0){
            g.drawImage(enemigo1,a,516-68-101,this);
        }
//        else{
//            g.drawImage(enemigo2,a,516-68-101,this);
//        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
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
    private class TAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if(key==KeyEvent.VK_NUMPAD0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Algo Paso");
                }
            }
            else if (key==KeyEvent.VK_RIGHT){
                a+=10;
            }
            else if (key==KeyEvent.VK_LEFT){
                a-=10;
            }
            
        }
    }
    
}

