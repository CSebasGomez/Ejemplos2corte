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
public class Factura {
    private  HashMap <String,Producto> productos; // Tiene un arreglo de productos 

    public Factura() {
        this.productos = new HashMap <>();
    }
    public void adicionarProducto(Producto producto){
        this.productos.put(producto.getNombre(),producto);// adicionar producto al arreglo
    }
    public HashMap<String,Producto> listarProducto(){
        return this.productos;
    }
    public double calcularTotal(){
        double total =0;
        for(Producto producto:productos.values()){//recorre todo el arreglo
            total+=producto.getPrecio();//va adicionando todos los precios para hallar el total
        }
        return total;
    }
}
