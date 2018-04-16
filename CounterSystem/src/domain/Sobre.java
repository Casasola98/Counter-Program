
package domain;

public class Sobre extends Mail {
    
    private TipoSobre tipo;
    private boolean esDocumento;
    private int peso;
    /**
     * Constructor de la clase Sobre
     * @param tipo
     * @param esDocumento
     * @param peso
     * @param id
     * @param descripcion 
     */
    public Sobre(TipoSobre tipo, boolean esDocumento, int peso, int id, String descripcion) {
        super(id, false, descripcion);
        setTipo(tipo);
        setEsDocumento(esDocumento);
        setPeso(peso);
    }
    /**
     * Retorna el tipo de sobre
     * @return 
     */
    public TipoSobre getTipo() {
        return tipo;
    }
    /**
     * Define el tipo de sobre 
     * @param tipo 
     */
    private void setTipo(TipoSobre tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna si el sobre es un documento o no
     * @return 
     */
    public boolean isEsDocumento() {
        return esDocumento;
    }
    /**
     * Define si el sobre es un documento o no
     * @param esDocumento 
     */
    private void setEsDocumento(boolean esDocumento) {
        this.esDocumento = esDocumento;
    }
    /**
     * Retorna el peso
     * @return 
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Define el peso del sobre
     * @param peso 
     */
    private void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Sobre{" + "id=" + id + "tipo=" + tipo + ", esDocumento=" + esDocumento + ", peso=" + peso + '}';
    }
    /**
     * Retorna la informacion del sobre 
     * @return 
     */
    public String getInfo(){
        String mensaje = "Sobre " + id + ", tipo " + tipo;
        if(esDocumento)
            mensaje += ", documento";
        else
            mensaje += ", articulo pequenno";
        mensaje += ", peso " + peso + "kg ";
        return mensaje;
    }
    /**
     * Retorna el costo de los impuestos del sobre 
     * @return 
     */
    public double getCosto(){
        if((esDocumento)&& tipo.equals(TipoSobre.Aereo))
            return 0;
        else if((esDocumento)&& tipo.equals(TipoSobre.Manila))
            return 1;
        else if((! esDocumento)&& tipo.equals(TipoSobre.Aereo))
            return 1;
        else
            return 2;
    }
    
}
