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
public class main {
    public static void main(String[] args) {
        Bank banco = new Bank();
        Client client1 = new Client("F","G","123",33,"fagiraldo");
        Client client2 = new Client("V","G","123",0,"valeria");
        
        Asset activo1= new Cash(100);
        Asset activo2 = new Stock(2,"Google",100,80);
        client1.addAsset(activo1);
        client2.addAsset(activo2);
        banco.addClients(client1);
        
        Asset activo3= new MutualFund(2,"Samsung",20,50);
        client2.addAsset(activo3);
        banco.addClients(client2);
        double totalMercado = banco.getAllMarketValue();
        System.out.println("Total"+totalMercado);
    }
}
