
package domain;


import java.util.ArrayList;
import java.util.Date;
import review.InfoReview;

public class Factura {
    
    private String texto;
    private ArrayList<Mail> retira;
    private double cambioDolar;
    private double totalDolares;
    private double totalColones;
    private double totalFDolares;
    private double totalFColones;
    private TipoCliente categoria;
    private Date fechaPago;
    
    /**
     * Constructor de las facturas
     * @param aRetirar
     * @param cambio
     * @param elCliente 
     */
    public Factura(ArrayList<Mail> aRetirar, double cambio, TipoCliente elCliente){
        setRetira(aRetirar);
        cambioDolar = cambio;
        totalColones = 0;
        totalDolares = 0;
        totalFColones = 0;
        totalFDolares = 0;
        categoria = elCliente;
    }
    /**
     * Retorna el total de dolares del costo de impuestos
     * @return 
     */
    public double getTotalDolares() {
        return totalDolares;
    }
    /**
     * Retorna el total de colones del costo de impuestos
     * @return 
     */
    public double getTotalColones() {
        return totalColones;
    }
    /**
     * Retorna el total de dolares del costo de impuestos, menos los descuentos
     * @return 
     */
    public double getTotalFDolares() {
        return totalFDolares;
    }
    /**
     * Retorna el total de colones del costo de impuestos, menos los descuentos
     * @return 
     */
    public double getTotalFColones() {
        return totalFColones;
    }
    /**
     * Retorna un string con la fecha en que se pago la factura
     * @return 
     */
    public String getStrFecha() {
        return InfoReview.getStrFecha(fechaPago);
    }
    /**
     * Da el valor, ArrayList, de los paquetes a retirar 
     * @param retira 
     */
    private void setRetira(ArrayList<Mail> retira) {
        this.retira = retira;
    }
    /**
     * Define la fecha en que se pago la factura
     * Y retira los paquetes
     */
    public void pagar(){
        fechaPago = new Date();
        for (Mail paq : retira){
            paq.retirar();
        }
    }
    /**
     * Calcula los costos de la factura
     * @return 
     */
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
        
        texto += "Total $" + totalDolares + "/ ₡" + totalColones + "\r\n"; 
        
        if(categoria.equals(TipoCliente.Plata)){
            totalFDolares = totalDolares * 0.95;
            totalFColones = totalColones * 0.95;
            texto += "Cliente Plata: $" + totalFDolares + "/ ₡" + totalFColones; 
        }else if(categoria.equals(TipoCliente.Oro)){
            totalFDolares = totalDolares * 0.90;
            totalFColones = totalColones * 0.90;
            texto += "Cliente Oro: $" + totalFDolares + "/ ₡" + totalFColones; 
        }else{
            totalFDolares = totalDolares;
            totalFColones = totalColones;
            texto += "Cliente es categoria Normal, paga el total.";
        }
        return texto;
    }
    
}
