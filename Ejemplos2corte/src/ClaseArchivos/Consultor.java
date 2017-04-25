/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseArchivos;

/**
 *
 * @author Estudiante
 */
public  class Consultor implements Contrato {
    protected int id;
    protected String labor;

    @Override
    public double CalcularSalario() {
        return 100;
    }

    @Override
    public String mostrarInformacion() {
        return "Colsultor "+ this.id+" "+this.labor;
    }
}
