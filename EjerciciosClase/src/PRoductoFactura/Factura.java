/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRoductoFactura;
import java.util.ArrayList; // importa la biblioteca de ArrayList
/**
 *
 * @author Estudiante
 */
public class Factura {
    private  ArrayList<Producto> productos; // Tiene un arreglo de productos 

    public Factura() {
        this.productos = new ArrayList <Producto>();
    }
    public void adicionarProducto(Producto producto){
        this.productos.add(producto);// adicionar producto al arreglo
    }
    public ArrayList<Producto> listarProducto(){
        return this.productos;
    }
    public double calcularTotal(){
        double total =0;
        for(Producto producto:productos){//recorre todo el arreglo
            total+=producto.getPrecio();//va adicionando todos los precios para hallar el total
        }
        return total;
    }
}
