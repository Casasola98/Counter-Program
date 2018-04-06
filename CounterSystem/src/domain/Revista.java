
package domain;

public class Revista extends Mail{
    
    private String nombre;
    private boolean esCatalogo;
    private TipoRevista tipo;

    public Revista(String nombre, boolean esCatalogo, TipoRevista tipo, int id, String descripcion) {
        super(id, false, descripcion);
        setNombre(nombre);
        setEsCatalogo(esCatalogo);
        setTipo(tipo);
    }
    
    public double getCosto(){
        if(esCatalogo)
            return 0;
        else 
            return 1;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsCatalogo() {
        return esCatalogo;
    }

    private void setEsCatalogo(boolean esCatalogo) {
        this.esCatalogo = esCatalogo;
    }

    public TipoRevista getTipo() {
        return tipo;
    }

    private void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Revista{" + "id=" + id + ", nombre=" + nombre + ", esCatalogo=" + esCatalogo + ", tipo=" + tipo + '}';
    }
    
    public String getInfo(){
        String mensaje = "Revista " + id;
        if(esCatalogo)
            mensaje += ", catalogo";
        mensaje += ", tema: " + tipo;
        return mensaje;
    }
    
}
