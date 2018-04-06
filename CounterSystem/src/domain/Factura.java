
package domain;


import java.util.ArrayList;

public class Factura {
    
    private String texto;
    private ArrayList<Mail> retira;
    private double cambioDolar;
    private double totalDolares;
    private double totalColones;
    
    
    public Factura(ArrayList<Mail> aRetirar, double cambio){
        setRetira(aRetirar);
        cambioDolar = cambio;
        totalColones = 0;
        totalDolares = 0;
    }

    private void setRetira(ArrayList<Mail> retira) {
        this.retira = retira;
    }
    
    public String calcularCosto(){
        texto = "";
        String datos;
        double enDolares;
        double enColones;
        for(Mail paq: retira){
            enDolares = paq.getCosto();
            enColones = enDolares * cambioDolar;
            enColones = Math.round(enColones * 100) / 100;
            totalDolares += enDolares;
            totalColones += enColones;
            datos = paq.getInfo() + ", costo $" + enDolares + "/ ₡" + enColones + "\r\n";
            
            texto += datos;
        }
        
        texto += "Total $" + totalDolares + "/ ₡" + totalColones; 
        
        return texto;
    }
    
    
}
