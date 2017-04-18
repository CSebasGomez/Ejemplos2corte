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
public class DividentStock extends Stock{
    private double dividends;
    
    @Override
    public double getMarketValue(){
        return(this.totalShares*this.currentPrice)+this.dividends;
    } 
}
