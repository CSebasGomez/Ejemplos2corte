/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInterfase.Ejemplo1;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Bank {
    private HashMap<String, Client> clients;
    public Bank(){
        this.clients=new HashMap<>();
    }
    public void addClients(Client client){
        this.clients.put(client.getEmail(), client);
    }
    public double getAllMarketValue(){
        double total=0;
        for (Client client : this.clients.values()) {
            for(Asset asset : client.getAssets()){
                total+=asset.getMarketValue();
            }
        }
        return total;
    }
    public double getAllProfit(){
        double total=0;
        for (Client client : this.clients.values()) {
            for(Asset asset : client.getAssets()){
                total+=asset.getProfit();
            }
        }
        return total;
    }
    public HashMap getAllByTypeAsset(){
        HashMap<String,Double> total = new HashMap<>(); 
        for(Client client :this.clients.values()){
            for(Asset asset: client.getAssets()){
                if (asset instanceof Cash){
                    if(!total.containsKey("cash")){
                        total.put("cash", asset.getMarketValue());
                    }
                    else{
                       Double valorActual = total.get("cash");
                       Double nuevoValor = valorActual + asset.getMarketValue();
                       total.put("cash", nuevoValor);
                    }
                }
                else if(asset instanceof MutualFund){
                    if(!total.containsKey("MutualFund")){
                        total.put("MutualFund", asset.getMarketValue());
                    }
                    else{
                       Double valorActual = total.get("MutualFund");
                       Double nuevoValor = valorActual + asset.getMarketValue();
                       total.put("MutualFund", nuevoValor);
                    }
                }
                else if(asset instanceof DividentStock){
                   if(!total.containsKey("DividentStock")){
                        total.put("DividentStock", asset.getMarketValue());
                    }
                    else{
                       Double valorActual = total.get("DividentStock");
                       Double nuevoValor = valorActual + asset.getMarketValue();
                       total.put("DividentStock", nuevoValor);
                    }
                }
                else if (asset instanceof Stock){
                    if(!total.containsKey("Stock")){
                        total.put("Stock", asset.getMarketValue());
                    }
                    else{
                       Double valorActual = total.get("Stock");
                       Double nuevoValor = valorActual + asset.getMarketValue();
                       total.put("Stock", nuevoValor);
                    }
                }
            }
        }
        return total;
    }
    public Client MaxProfit(){
        Client MaxProfit =null; double profit;
        double BeneficioMaximo=0;
        for(Client client :this.clients.values()){
            profit =0;
            for(Asset asset: client.getAssets()){
                profit+=asset.getProfit();
            }
            if(MaxProfit==null){
                MaxProfit=client;
                BeneficioMaximo = profit;
            }
            else{
                if(profit>=BeneficioMaximo){
                    MaxProfit=client;
                    BeneficioMaximo=profit;
                }
            }
        }
        return MaxProfit;
    }
}
