/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTreeMap;
import java.util.HashMap;

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
        p2.setPrecio(20000);
        
         Producto p3= new Producto();
        p3.setNombre("Agua");
        p3.setPrecio(1000);
        
       
     
        factura.adicionarProducto(p3);
           factura.adicionarProducto(p2); factura.adicionarProducto(p1);
        HashMap <String,Producto> lista= factura.listarProducto();
//        for(String clave : lista.keySet()){// busca  y genera la lista de claves
//            Producto p= lista.get(clave);
//            System.out.println(p.getNombre()+" "+p.getPrecio());
//        }
            for (Producto p: lista.values()) {
             System.out.println(p.getNombre()+" "+p.getPrecio());
        }
    }
}
