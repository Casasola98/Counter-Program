
package domain;

import java.util.Date;
import review.InfoReview;

public abstract class Mail {
    
    protected int id;
    protected boolean estado;
    protected String descripcion;
    protected Date fechaEnvio;
    protected Date fechaRecibido;

    public Mail(int id, boolean estado, String descripcion) {
        setId(id);
        setEstado(estado);
        setDescripcion(descripcion);
        setFechaEnvio();
    }

    public abstract double getCosto();
    public abstract String getInfo();
    
    public String getStrEnvio() {
        return InfoReview.getStrFecha(fechaEnvio);
    }
    
    public String getStrRecibe() {
        return InfoReview.getStrFecha(fechaRecibido);
    }
    
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio() {
        this.fechaEnvio = new Date();
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }
    
    public int getId() {
        return id;
    }
    
    private void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}
