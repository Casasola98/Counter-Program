
package domain;

public class Sobre extends Mail {
    
    private TipoSobre tipo;
    private boolean esDocumento;
    private int peso;

    public Sobre(TipoSobre tipo, boolean esDocumento, int peso, int id, String descripcion) {
        super(id, false, descripcion);
        setTipo(tipo);
        setEsDocumento(esDocumento);
        setPeso(peso);
    }

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
    
    public TipoSobre getTipo() {
        return tipo;
    }

    private void setTipo(TipoSobre tipo) {
        this.tipo = tipo;
    }

    public boolean isEsDocumento() {
        return esDocumento;
    }

    private void setEsDocumento(boolean esDocumento) {
        this.esDocumento = esDocumento;
    }

    public int getPeso() {
        return peso;
    }

    private void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Sobre{" + "id=" + id + "tipo=" + tipo + ", esDocumento=" + esDocumento + ", peso=" + peso + '}';
    }
    
    public String getInfo(){
        String mensaje = "Sobre " + id + ", tipo " + tipo;
        if(esDocumento)
            mensaje += ", documento";
        else
            mensaje += ", articulo pequenno";
        mensaje += ", peso " + peso + "kg ";
        return mensaje;
    }
    
}
