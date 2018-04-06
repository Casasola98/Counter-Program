
package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Genero genero;
    private Date fechaNacimiento;
    private Locker casillero;

    public Cliente(int id, String nombre, String correo, String telefono, String direccion, Genero genero, Date fechaNacimiento) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo + "@gmail.com");
        setTelefono(telefono);
        setDireccion(direccion);
        setGenero(genero);
        setFechaNacimiento(fechaNacimiento);
    }

    public Locker getCasillero() {
        return casillero;
    }

    public void setCasillero(Locker casillero) {
        this.casillero = casillero;
    }
    
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    private void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Genero getGenero() {
        return genero;
    }

    private void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getStrFecha(){
        return new SimpleDateFormat("dd-MM-yyyy").format(fechaNacimiento);
    }

    private void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String obtenerInformacion(){
        String mensaje = "";
        mensaje += "Id: " + getId() + "\r\n";
        mensaje += "Nombre: " + getNombre() + "\r\n";
        mensaje += "Correo: " + getCorreo() + "\r\n";
        mensaje += "Telefono: " + getTelefono() + "\r\n";
        mensaje += "Direccion: " + getDireccion() + "\r\n";
        mensaje += "Genero: " + getGenero() + "\r\n";
        mensaje += "Fecha Nacimiento: " + getStrFecha() + "\r\n";
        mensaje += "Casillero: " + getCasillero().getId();
        return mensaje;
    }
    
    public String[] obtenerDatos(){
        String[] datos = new String[7];
        datos[0] = String.valueOf(id);
        datos[1] = getNombre();
        String[] elCorreo = getCorreo().split("@");
        datos[2] = elCorreo[0];
        datos[3] = getTelefono();
        datos[4] = getDireccion(); 
        datos[5] = getGenero().toString();
        datos[6] = getStrFecha();
        return datos;
    }
    
    public void editarDatos(String nombre, String correo, String telefono, String direccion, Genero genero, Date fechaNacimiento){
        setNombre(nombre);
        setCorreo(correo + "@gmail.com");
        setTelefono(telefono);
        setDireccion(direccion);
        setGenero(genero);
        setFechaNacimiento(fechaNacimiento);
    }
    
}
