
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
    /**
     * Constructor de la clase Cliente, crea los clientes del counter
     * @param id
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion
     * @param genero
     * @param fechaNacimiento 
     */
    public Cliente(int id, String nombre, String correo, String telefono, String direccion, Genero genero, Date fechaNacimiento) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo + "@gmail.com");
        setTelefono(telefono);
        setDireccion(direccion);
        setGenero(genero);
        setFechaNacimiento(fechaNacimiento);
    }
    /**
     * Retorna el casillero del usuario
     * @return 
     */
    public Locker getCasillero() {
        return casillero;
    }
    /**
     * Otorga valor al casillero del usuario
     * @param casillero 
     */
    public void setCasillero(Locker casillero) {
        this.casillero = casillero;
    }
    /**
     * Obtiene el id del cliente
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Otorga el valor al id del usuario
     * @param id 
     */
    private void setId(int id) {
        this.id = id;
    }
    /**
     * Retorna el nombre del usuario
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define el nombre del usuario
     * @param nombre 
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna el correo electronico del cliente
     * @return 
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Define el correo del usuario
     * @param correo 
     */
    private void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Retorna el numero de telefono del usuario
     * @return 
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Define el numero de telefono del usuario
     * @param telefono 
     */
    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Obtiene la direccion del usuario
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Define la direccion del cliente
     * @param direccion 
     */
    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Retorna el genero del usuario
     * @return 
     */
    public Genero getGenero() {
        return genero;
    }
    /**
     * Define el genero, si es Masculino o Femenino
     * @param genero 
     */
    private void setGenero(Genero genero) {
        this.genero = genero;
    }
    /**
     * Retorna la fecha de nacimiento del usuario
     * @return 
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Retorna un String con la fecha de nacimiento
     * @return 
     */
    public String getStrFecha(){
        return new SimpleDateFormat("dd-MM-yyyy").format(fechaNacimiento);
    }
    /**
     * Define la fecha de nacimiento
     * @param fechaNacimiento 
     */
    private void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Retorna un String con la informacion del usuario y su numero de casillero
     * @return 
     */
    public String obtenerInformacion(){
        String mensaje = "";
        mensaje += "Id: " + getId() + "\r\n";
        mensaje += "Nombre: " + getNombre() + "\r\n";
        mensaje += "Correo: " + getCorreo() + "\r\n";
        mensaje += "Telefono: " + getTelefono() + "\r\n";
        mensaje += "Direccion: " + getDireccion() + "\r\n";
        mensaje += "Genero: " + getGenero() + "\r\n";
        mensaje += "Fecha Nacimiento: " + getStrFecha() + "\r\n";
        mensaje += "Casillero: " + getCasillero().getId() + "\r\n \r\n";
        return mensaje;
    }
    /**
     * Retorna la informacion basica del usuario y la cantidad de retirables que posee
     * @return 
     */
    public String infoPendientes(){
        String mensaje = "";
        mensaje += "Id: " + getId() + "\r\n";
        mensaje += "Nombre: " + getNombre() + "\r\n";
        mensaje += "Correo: " + getCorreo() + "\r\n";
        mensaje += "Telefono: " + getTelefono() + "\r\n";
        mensaje += "Cantidad Retirables: " + casillero.cantidadRetirables() + "\r\n \r\n";
        return mensaje;
    }
    /**
     * Retorna un arreglo con los datos del usuario, en caso de que se necesiten todos por separado
     * @return 
     */
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
    /**
     * Edita la informacion del usuario en especifico
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion
     * @param genero
     * @param fechaNacimiento 
     */
    public void editarDatos(String nombre, String correo, String telefono, String direccion, Genero genero, Date fechaNacimiento){
        setNombre(nombre);
        setCorreo(correo + "@gmail.com");
        setTelefono(telefono);
        setDireccion(direccion);
        setGenero(genero);
        setFechaNacimiento(fechaNacimiento);
    }
    /**
     * Retorna el tipo de usuario que es, ya sea normal, plata u oro
     * El tipo de usuario va a depender de la cantidad de paquetes necesarias para pasar de nivel en el momento de la consulta
     * @param pasoCategoria
     * @return 
     */
    public TipoCliente getTipo(int pasoCategoria){
        int recibidos = casillero.totalRecibidos();
        if(recibidos >= pasoCategoria*2)
            return TipoCliente.Oro;
        else if (recibidos >= pasoCategoria)
            return TipoCliente.Plata;
        else return TipoCliente.Normal;
    }
    /**
     * Retorna la informacion en caso de que el usuario pase de nivel
     * @param cantidad
     * @return 
     */
    public String pasoNivel(int cantidad){
        String mensaje = "";
        int recibidos = casillero.totalRecibidos();
        if(recibidos == cantidad)
            mensaje = "Felicidades, ha subido a categoria " + TipoCliente.Plata;
        else if(recibidos == (cantidad*2))
            mensaje = "Felicidades, el usuario " + id + " ha subido a categoria " + TipoCliente.Oro;
        return mensaje;
    }
    
}
