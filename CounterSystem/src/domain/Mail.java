
package domain;

import java.util.Date;
import review.InfoReview;

public abstract class Mail {
    
    protected int id;
    protected boolean estado;
    protected String descripcion;
    protected Date fechaEnvio;
    protected Date fechaRecibido;

    /**
     * Constructor de la clase
     * @param id
     * @param estado
     * @param descripcion 
     */
    public Mail(int id, boolean estado, String descripcion) {
        setId(id);
        setEstado(estado);
        setDescripcion(descripcion);
        setFechaEnvio();
    }
    /**
     * Metodo abstracto para obtener el costo de los impuestos del paquete, sobre o revista
     * @return 
     */
    public abstract double getCosto();
    /**
     * Metodo abstracto para obtener la informacion del paquete, sobre o revista
     * @return 
     */
    public abstract String getInfo();
    /**
     * Retira el paquete, define el estado como true, para saber que ya se ha retirado
     */
    public void retirar(){
        estado = true;
        fechaRecibido = new Date();
    }
    /**
     * Retorna la fecha de envio como un string
     * @return 
     */
    public String getStrEnvio() {
        return InfoReview.getStrFecha(fechaEnvio);
    }
    /**
     * Retorna la fecha de recibido como un string
     * @return 
     */
    public String getStrRecibe() {
        return InfoReview.getStrFecha(fechaRecibido);
    }
    /**
     * Obtiene la fecha de Envio del paquete
     * @return 
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }
    /**
     * Define la fecha de envio
     */
    public void setFechaEnvio() {
        this.fechaEnvio = new Date();
    }
    /**
     * Retorna la fecha en que se retiro el paquete
     * @return 
     */
    public Date getFechaRecibido() {
        return fechaRecibido;
    }
    /**
     * Define la fecha de retiro del paquete
     * @param fechaRecibido 
     */
    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }
    /**
     * Retorna el id del paquete
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Define el id
     * @param id 
     */
    private void setId(int id) {
        this.id = id;
    }
    /**
     * Retorna si el paquete se retiro o no
     * @return 
     */
    public boolean isEstado() {
        return estado;
    }
    /**
     * Define el estado del paquete
     * @param estado 
     */
    private void setEstado(boolean estado) {
        this.estado = estado;
    }
    /**
     * Obtiene la descripcion del paquete
     * @return 
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Define la descripcion del mail
     * @param descripcion 
     */
    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}
