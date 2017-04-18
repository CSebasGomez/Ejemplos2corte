/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInterfase.Ejemplo1;

/**
 *
 * @author Estudiante
 */
public interface Asset {
    public double getMarketValue(); // si se coloca el abstract o no , no importa lo toma como un abstract
    public abstract double getProfit();
    
}
