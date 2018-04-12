
package domain;

public class Revista extends Mail{
    
    private String nombre;
    private boolean esCatalogo;
    private TipoRevista tipo;
    /**
     * Constructor de la clase revista
     * @param nombre
     * @param esCatalogo
     * @param tipo
     * @param id
     * @param descripcion 
     */
    public Revista(String nombre, boolean esCatalogo, TipoRevista tipo, int id, String descripcion) {
        super(id, false, descripcion);
        setNombre(nombre);
        setEsCatalogo(esCatalogo);
        setTipo(tipo);
    }
    /**
     * Retorna el nombre de la revista
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define el nombre 
     * @param nombre 
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna si es catalogo
     * @return 
     */
    public boolean isEsCatalogo() {
        return esCatalogo;
    }
    /**
     * Define si es catalogo
     * @param esCatalogo 
     */
    private void setEsCatalogo(boolean esCatalogo) {
        this.esCatalogo = esCatalogo;
    }
    /**
     * Retorna el tipo/tema de la revista
     * @return 
     */
    public TipoRevista getTipo() {
        return tipo;
    }
    /**
     * Define el tema de la revista
     * @param tipo 
     */
    private void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Revista{" + "id=" + id + ", nombre=" + nombre + ", esCatalogo=" + esCatalogo + ", tipo=" + tipo + '}';
    }
    
    /**
     * Obtiene la informacion de la revista
     * @return 
     */
    public String getInfo(){
        String mensaje = "Revista " + id;
        if(esCatalogo)
            mensaje += ", catalogo";
        mensaje += ", tema: " + tipo;
        return mensaje;
    }
    /**
     * Obtiene el costo de los impuestos de la revista
     * @return 
     */
    public double getCosto(){
        if(esCatalogo)
            return 0;
        else 
            return 1;
    }
    
}
