/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRoductoFactura;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        Producto p1 = new Producto();
        p1.setNombre("Gaseosa");
        p1.setPrecio(1500);
        
        Producto p2= new Producto();
        p2.setNombre("Papas");
        p2.setPrecio(1000);
        factura.adicionarProducto(p1);
        factura.adicionarProducto(p2);
        ArrayList <Producto> lista= factura.listarProducto();
        for(int i =0; i<lista.size();i++){
            Producto p= lista.get(i);
            System.out.println(p.getNombre()+" "+p.getPrecio());
        }
    }
}
