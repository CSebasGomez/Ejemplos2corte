/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseArchivos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class CasaSoftware {
    private ArrayList<Contrato> contratos;
    public CasaSoftware(){
        this.contratos = new ArrayList<>();
    }
    
    public void adicionarContrato(Contrato contrato){
        this.contratos.add(contrato);
    }
    public double CalcularSlarioTotal(){
        double salarioTotal=0;
        for(Contrato contrato : contratos){
            salarioTotal+=contrato.CalcularSalario();
        }
        return salarioTotal;
    }
    public String MostrarInformacion(){
        String informacion ="";
        for(Contrato contrato : contratos){
            informacion+=" "+contrato.mostrarInformacion();
        }
        return informacion;
    }
}
