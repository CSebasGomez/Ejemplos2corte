/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Estudiante
 */
public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizzas pizza1=new Pizzas();
        Pizzas pizza2=new Pizzas();
        String top1 =pizza1.getIngredientes();
        double precio1 =pizza1.getPrize();
        int diametro1 =pizza1.getDiameter();
        String top2=pizza2.getIngredientes();
        double precio2=pizza2.getPrize();
        int diametro2=pizza2.getDiameter(); 
        System.out.println(top1+" "+precio1+" "+diametro1);
        System.out.println(top2+" "+precio2+" "+diametro2);
    }
}
