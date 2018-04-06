
package domain;

public class Paquete extends Mail{
    
    private TipoPaquete tipo;
    private boolean electronicos;
    private boolean fragil;
    private int peso;

    public Paquete(TipoPaquete tipo, boolean electronicos, boolean fragil, int peso, int id, String descripcion) {
        super(id, false, descripcion);
        setTipo(tipo);
        setElectronicos(electronicos);
        setFragil(fragil);
        setPeso(peso);
    }

    public double getCosto(){
        double costo = peso  + 0.02;
        if(electronicos)
            costo += 2;
        if(fragil)
            costo += 2;
        return costo;
    }
    
    public TipoPaquete getTipo() {
        return tipo;
    }

    private void setTipo(TipoPaquete tipo) {
        this.tipo = tipo;
    }

    public boolean isElectronicos() {
        return electronicos;
    }

    private void setElectronicos(boolean electronicos) {
        this.electronicos = electronicos;
    }

    public boolean isFragil() {
        return fragil;
    }

    private void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public int getPeso() {
        return peso;
    }

    private void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paquete{" + "id=" + id + ", tipo=" + tipo + ", electronicos=" + electronicos + ", fragil=" + fragil + ", peso=" + peso + '}';
    }
    
    public String getInfo(){
        String mensaje = "Paquete " + id + ", tipo " + tipo;
        if(electronicos)
            mensaje += ", posee electronicos";
        if(fragil)
            mensaje += ", es fragil";
        mensaje += ", peso " + peso + "kg ";
        return mensaje;
    }
    
}
