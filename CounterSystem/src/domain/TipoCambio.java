package domain;

import HTTPGet.GetMethod;
import HTTPGet.XmlParser;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TipoCambio {

    private int indicador = 0; //317: Compra, 318: Venta
    private String tcFechaInicio;
    private String tcFechaFinal;
    private final String tcNombre = "Counter";
    private final String tnSubNiveles = "N";
    private final String HOST = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsindicadoreseconomicos.asmx/ObtenerIndicadoresEconomicosXML";
    private String url;
    private final String VALUE_TAG = "NUM_VALOR";
    
    /**
     * Constructor de la clase tipoCambio
     */
    public TipoCambio(){
        setFecha();
    }
    /**
     * Retorna el costo de la compra del dolar
     * @return 
     */
    public double getCompra(){
        setCompra();
    
        double valor = Double.parseDouble(getValue());
        return valor;
    }
    /**
     * Define el indicador para que la busqueda del api sea el precio de la compra
     */
    private void setCompra(){
        this.indicador = 317;
    }
    /**
     * Retorna el valor de la venta del dolar
     * @return 
     */
    public double getVenta(){
        setVenta();
    
        double valor = Double.parseDouble(getValue());
        return valor;
    }
    /**
     * Define el indicador para que la busqueda del api sea el precio de la venta
     */
    private void setVenta(){
        this.indicador = 318;
    }
    
    private String getValue(){
        try {
            setUrl();
            String data = GetMethod.getHTML(url);
            XmlParser xml = new XmlParser(data);
      
            return xml.getValue(VALUE_TAG);
        } catch (Exception e) {
            System.out.println("Error al obtener el valor del BCCR.");
            
            return "0";
        }
    }
    /**
     * Define la URL para realizar el HTTP REQUEST, y consultar la compra o venta del dolar
     */
    private void setUrl(){
        String params = "tcIndicador="+indicador+"&tcFechaInicio="+tcFechaInicio+"&tcFechaFinal="+tcFechaFinal+"&tcNombre="+tcNombre+"&tnSubNiveles="+tnSubNiveles;
        this.url = HOST+"?"+params;
    }
    /**
     * Define la fecha para el rango de fechas en que se consultara el valor del dolar
     */
    private void setFecha(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
        this.tcFechaInicio = sdf.format(date);
        this.tcFechaFinal = tcFechaInicio;
    }

}
