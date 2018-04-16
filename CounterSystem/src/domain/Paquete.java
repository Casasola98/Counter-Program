
package domain;

public class Paquete extends Mail{
    
    private TipoPaquete tipo;
    private boolean electronicos;
    private boolean fragil;
    private int peso;
    /**
     * Constructor de la clase Paquete
     * @param tipo
     * @param electronicos
     * @param fragil
     * @param peso
     * @param id
     * @param descripcion 
     */
    public Paquete(TipoPaquete tipo, boolean electronicos, boolean fragil, int peso, int id, String descripcion) {
        super(id, false, descripcion);
        setTipo(tipo);
        setElectronicos(electronicos);
        setFragil(fragil);
        setPeso(peso);
    }
    /**
     * Retorna el tipo de paquete que es
     * @return 
     */
    public TipoPaquete getTipo() {
        return tipo;
    }
    /**
     * Define el tipo de paquete
     * @param tipo 
     */
    private void setTipo(TipoPaquete tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna si el paquete posee o no electronicos
     * @return 
     */
    public boolean isElectronicos() {
        return electronicos;
    }
    /**
     * Define si el paquete tiene o no electronicos
     * @param electronicos 
     */
    private void setElectronicos(boolean electronicos) {
        this.electronicos = electronicos;
    }
    /**
     * Retorna si el paquete es fragil o no
     * @return 
     */
    public boolean isFragil() {
        return fragil;
    }
    /**
     * Define si es fragil o no
     * @param fragil 
     */
    private void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
    /**
     * Obtiene el peso del paquete
     * @return 
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Define el peso del paquete
     * @param peso 
     */
    private void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Paquete{" + "id=" + id + ", tipo=" + tipo + ", electronicos=" + electronicos + ", fragil=" + fragil + ", peso=" + peso + '}';
    }
    /**
     * Obtiene la informacion del paquete
     * @return 
     */
    public String getInfo(){
        String mensaje = "Paquete " + id + ", tipo " + tipo;
        if(electronicos)
            mensaje += ", posee electronicos";
        if(fragil)
            mensaje += ", es fragil";
        mensaje += ", peso " + peso + "kg ";
        return mensaje;
    }
    /**
     * Obtiene el costo de los impuestos que cuesta el paquete
     * @return 
     */
    public double getCosto(){
        double costo = peso  + 0.02;
        if(electronicos)
            costo += 2;
        if(fragil)
            costo += 2;
        return costo;
    }
    
}
