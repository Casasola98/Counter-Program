
package domain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import review.InfoReview;

public class Counter {
    
    private String nombre;
    private String cedulaJuridica;
    private String direccion;
    private int cantidadCasilleros;
    private int cantidadPaquetes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Locker> casilleros;
    private ArrayList<Mail> paquetes;
    private ArrayList<Factura> facturas;
    private ArrayList<Integer> disponibles;
    private ArrayList<Mail> aRetirar;
    private ArrayList<Mail> seRetiran;
    private Factura facturaActual;
    private TipoCambio cambioDolar;

    /**
     * Constructor del counter
     * @param nombre
     * @param cedulaJuridica
     * @param direccion
     * @param cantidadCasilleros 
     */
    public Counter(String nombre, String cedulaJuridica, String direccion, int cantidadCasilleros) {
        setNombre(nombre);
        setCedulaJuridica(cedulaJuridica);
        setDireccion(direccion);
        setCantidadCasilleros(cantidadCasilleros);
        setCantidadPaquetes(10);
        clientes = new ArrayList();
        casilleros = new ArrayList();
        paquetes = new ArrayList();
        disponibles = new ArrayList();
        facturas = new ArrayList();
        aRetirar = new ArrayList();
        seRetiran = new ArrayList();
        crearDisponibles();
    }
    /**
     * Retorna un string con la informacion del usuario en especifico que se desea obtener
     * @param idC
     * @return 
     */
    public String infoCliente(int idC){
        Cliente actual = getCliente(idC);
        return actual.obtenerInformacion();
    }
    /**
     * Retorna un arreglo con la informacion del usuario en especifico que se desea obtener
     * @param idC
     * @return 
     */
    public String[] infoCliente2(int idC){
        Cliente actual = getCliente(idC);
        return actual.obtenerDatos();
    }
    /**
     * Retorna si hay lockers disponibles
     * @return 
     */
    public boolean hayLockers(){
        if(disponibles.size() > 0 ){
            return true;
        }
        return false;
    }
    /**
     * Obtiene el valor de venta del dolar del dia en especifico
     * @return 
     */
    public String obtenerVenta(){
        cambioDolar = new TipoCambio();
        return String.valueOf(cambioDolar.getVenta());
    }
    /**
     * Obtiene un Strign con la informacion del tipo de cambio del dia, venta y compra
     * @return 
     */
    public String obtenerCambio(){
        cambioDolar = new TipoCambio();
        double venta = cambioDolar.getVenta();
        double compra = cambioDolar.getCompra();
        String mensaje = "    Venta: ₡" + venta + "\r\n";
        mensaje += "Compra: ₡" + compra + "\r\n";
        return mensaje;
    }
    /**
     * Retira todos los paquetes que el usuario puede retirar en el momento
     * @param cliente
     * @return 
     */
    public String retirarTodos(int cliente){
        seRetiran = aRetirar;
        return getFactura(cliente);
    }
    /**
     * Retira los paquetes en especifico que el usuario desea retirar en el momento
     * @param cliente
     * @return 
     */
    public String retirarElegidos(int cliente){
        return getFactura(cliente);
    }
    /**
     * Retorna un string con la factura del retiro de paquetes que realiza el usuario
     * @param cliente
     * @return 
     */
    private String getFactura(int cliente){
        Cliente actual = getCliente(cliente);
        TipoCliente tipoClient = actual.getTipo(cantidadPaquetes);
        
        facturaActual = new Factura(seRetiran, cambioDolar.getVenta(), tipoClient);
        String mensaje = facturaActual.calcularCosto();
        return mensaje;
    }
    /**
     * Cuando el usuario decide retirar los paquetes, se agrega la factura a facturas ya que se realizo la transaccion
     * Y se paga la factura
     */
    public void retirar(){
        facturas.add(facturaActual);
        facturaActual.pagar();
    }
    /**
     * Crea un array que posee los ids de todos los casilleros disponibles en el momento
     * De esta manera se saben cuales casilleros se pueden otorgar a un usuario
     */
    private void crearDisponibles(){
        int numero;
        for(int number = 0; number < cantidadCasilleros; number++){
            numero = 1000 + number;
            disponibles.add(numero);
        }
    }
    /**
     * Revisa si el id ingresado corresponde a un usuario
     * @param pUser
     * @return 
     */
    public boolean existeCliente(int pUser){
        for(Cliente usuario : clientes){
            if(usuario.getId() == pUser){
                return true;
            }
        }
        return false;
    }
    /**
     * Revisa si el id ingresado corresponde a un casillero
     * @param pLocker
     * @return 
     */
    public boolean existeLocker(int pLocker){
        for(Locker casillero : casilleros){
            if(casillero.getId() == pLocker){
                return true;
            }
        }
        return false;
    }
    /**
     * Retorna si el id del locker esta libre, es decir, el casillero no esta en uso
     * @param pLocker
     * @return 
     */
    public boolean lockerEnUso(int pLocker){
        for(int casillero : disponibles){
            if(casillero == pLocker){
                return false;
            }
        }
        return true;
    }
    /**
     * Revisa si el id ingresado corresponde a un paquete, sobre o revista
     * @param pPaquete
     * @return 
     */
    public boolean existeMail(int pPaquete){
        for(Mail paquete : paquetes){
            if(paquete.getId() == pPaquete){
                return true;
            }
        }
        return false;
    }
    /**
     * Retorna el cliente elegido
     * @param pUser
     * @return 
     */
    private Cliente getCliente(int pUser){
        for(Cliente usuario : clientes){
            if(usuario.getId() == pUser){
                return usuario;
            }
        }
        return null;
    }
    /**
     * Retorna el casillero elegido
     * @param pLocker
     * @return 
     */
    private Locker getLocker(int pLocker){
        for(Locker casillero : casilleros){
            if(casillero.getId() == pLocker){
                return casillero;
            }
        }
        return null;
    }
    /**
     * Retorna el paquete elegido
     * @param pPaquete
     * @return 
     */
    private Mail getMail(int pPaquete){
        for(Mail paquete : paquetes){
            if(paquete.getId() == pPaquete){
                return paquete;
            }
        }
        return null;
    }
    /**
     * Retorna el paquete elegido entre la lista de paquetes que el usuario puede retirar
     * @param idM
     * @return 
     */
    private Mail getRetira(int idM){
        for(Mail paquete : aRetirar){
            if(paquete.getId() == idM){
                return paquete;
            }
        }
        return null;
    }
    /**
     * Solicita al casillero del usuario en especifico los paquetes que puede retirar
     * Coloca estos paquetes en el ArrayList aRetirar
     * @param idCliente 
     */
    private void getRetirables(int idCliente){
        Cliente usuario = getCliente(idCliente);
        Locker casillero = usuario.getCasillero();
        aRetirar = casillero.getRetirables();
        seRetiran = new ArrayList();
    }
    /**
     * Retorna la informacion de los paquetes que puede retirar el usuario
     * @param idCliente
     * @return 
     */
    public String getInfoRetirables(int idCliente){
        String mensaje = "";
        getRetirables(idCliente);
        for(Mail retirar: aRetirar){
            mensaje += retirar.toString() + "\r\n";
        }
        return mensaje;
    }
    /**
     * Retorna un String con la informacion de los usuarios y la cantidad de paquetes que puede posee para retirar
     * @return 
     */
    public String getClientesRetirables(){
        String mensaje = "";
        for(Cliente actual: clientes){
            mensaje +=  actual.infoPendientes();
        }
        return mensaje;
    }
    /**
     * Retorna la informacion de todos los usuarios del sistema
     * @return 
     */
    public String getInfoClientes(){
        String mensaje = "";
        for(Cliente actual: clientes){
            mensaje +=  actual.obtenerInformacion();
        }
        return mensaje;
    }
    /**
     * Envia un email al usuario con los paquetes que puede retirar
     * @param id 
     */
    public void enviarRetirablesMail(int id){
        Cliente actual = getCliente(id);
        enviarCorreo(actual);
    }
    /**
     * Retorna si el usuario puede o no retirar ese paquete elegido
     * @param idM
     * @return 
     */
    public boolean esRetirable(int idM){
        for(Mail retira: aRetirar){
            if(idM == retira.getId())
                return true;
        }
        return false;
    }
    /**
     * Retorna si el paquete elegido se puede agregar o no al array seRetiran
     * @param idM
     * @return 
     */
    public boolean seRetira(int idM){
        for(Mail retira: seRetiran){
            if(idM == retira.getId())
                return false;
        }
        return true;
    }
    /**
     * Agrega el paquete a la lista de paquetes seRetiran, los cuales son los que el usuario va a retirar
     * @param idM 
     */
    public void addRetirar(int idM){
        seRetiran.add(getRetira(idM));
    }
    /**
     * Retorna los paquetes que fueron enviados en una fecha en especifico
     * @param fecha
     * @return 
     */
    public String getEnviados(String fecha){
        String mensaje = "";
        
        for(Mail enviado: paquetes){
            String fechaEnviado = enviado.getStrEnvio();
            if(fecha.equals(fechaEnviado)){
                mensaje += enviado.toString() + "\r\n";
            }
        }
        if(mensaje.isEmpty()){
            mensaje = "No se han enviado objetos en dicha fecha";
        }
        return mensaje;
    }
    /**
     * Retorna el resumen con los datos de impuestos, descuentos y total de una fecha en especifico
     * @param fecha
     * @return 
     */
    public String getResumen(String fecha){
        String mensaje = "";
        double impuestosD = 0;
        double descuentosD = 0;
        double totalD = 0;
        double impuestosC = 0;
        double descuentosC = 0;
        double totalC = 0;
        for(Factura actualF: facturas){
            String fechaPago = actualF.getStrFecha();
            if(fecha.equals(fechaPago)){
                impuestosD += actualF.getTotalDolares();
                totalD += actualF.getTotalFDolares();
                impuestosC += actualF.getTotalColones();
                totalC += actualF.getTotalFColones();
            }
        }
        mensaje += "Colones \r\n";
        mensaje += "Impuestos: ₡" + impuestosC + "\r\n";
        mensaje += "Descuentos: ₡" + (totalC - impuestosC) + "\r\n";
        mensaje += "Total: ₡" + totalC + "\r\n \r\n";
        mensaje += "Dolares \r\n";
        mensaje += "Impuestos: $" + impuestosD + "\r\n";
        mensaje += "Descuentos: $" + (totalD - impuestosD) + "\r\n";
        mensaje += "Total: $" + totalD;
        return mensaje;
    }
    /**
     * Retorna los paquetes que fueron recibidos en una fecha en especifico
     * @param fecha
     * @return 
     */
    public String getRecibidos(String fecha){
        String mensaje = "";
        
        for(Mail recibido: paquetes){
            String fechaRecibe = recibido.getStrRecibe();
            if(recibido.isEstado()){
                if(fecha.equals(fechaRecibe))
                    mensaje += recibido.toString() + "\r\n";
            }
        }
        if(mensaje.isEmpty()){
            mensaje = "No se han enviado objetos en dicha fecha";
        }
        return mensaje;
    }
    /**
     * Agrega un cliente a la lista de clientes
     * @param id
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion
     * @param genero
     * @param fechaNacimiento 
     */
    public void agregarCliente(int id, String nombre, String correo, String telefono, String direccion, int genero, String fechaNacimiento){
        Date fecha = InfoReview.crearFecha(fechaNacimiento);
        Genero actualG = Genero.Femenino;
        if(genero == 0){
            actualG = Genero.Masculino;
        }
        Cliente nuevoCliente = new Cliente(id, nombre, correo, telefono, direccion, actualG, fecha);
        clientes.add(nuevoCliente);
        Locker newLocker = agregarCasillero();
        nuevoCliente.setCasillero(newLocker);
        InfoReview.infoMessage("Usuario " + id + ", su casillero es el " + newLocker.getId());
    }
    /**
     * Edita la informacion de un usuario en especifico
     * @param id
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion
     * @param genero
     * @param fechaNacimiento 
     */
    public void editarCliente(int id, String nombre, String correo, String telefono, String direccion, int genero, String fechaNacimiento){
        Date fecha = InfoReview.crearFecha(fechaNacimiento);
        Genero actualG = Genero.Femenino;
        if(genero == 0){
            actualG = Genero.Masculino;
        }
        Cliente elCliente = getCliente(id);
        elCliente.editarDatos(nombre, correo, telefono, direccion, actualG, fecha);
    }
    /**
     * Borra el cliente elegido
     * @param id 
     */
    public void borrarCliente(int id){
        Cliente elCliente = getCliente(id);
        Locker elLocker = elCliente.getCasillero();
        disponibles.add(elLocker.getId());
        elLocker.cambiarEstado();
        elLocker.resetearPaquetes();
        clientes.remove(elCliente);
    }
    /**
     * Agrega el casillero al sistema, en caso de que el casillero ya exista lo retorna para que el usuario lo utilice
     * Si el casillero no existe lo crea desde cero
     * @return 
     */
    private Locker agregarCasillero(){
        int id =  disponibles.get(0);
        disponibles.remove(0);
        Locker nuevoCasillero;
        if(existeLocker(id)){
            nuevoCasillero = getLocker(id);
            nuevoCasillero.cambiarEstado();
        }else{
            nuevoCasillero = new Locker(id);
            casilleros.add(nuevoCasillero);
        }
        return nuevoCasillero;
    }
    /**
     * Agrega el paquete al sistema y al locker del usuario, ademas envia un correo notificando que el usuario recibio un paquete
     * @param envia
     * @param recibe
     * @param descripcion
     * @param pesoT
     * @param electronico
     * @param fragil
     * @param empaque
     * @return 
     */
    public String agregarPaquete(int envia, int recibe, String descripcion, int pesoT, int electronico, int fragil, int empaque){
        Cliente remitente = getCliente(envia);
        Cliente destinatario = getCliente(recibe);
        Locker locRemitente = remitente.getCasillero();
        Locker locDestino = destinatario.getCasillero();
        
        TipoPaquete tipoP = TipoPaquete.Bolsa;
        if(empaque == 0){
            tipoP = TipoPaquete.Caja;
        }
        
        boolean electro = false;
        if(electronico == 0){
            electro = true;
        }
        
        boolean fragiles = false;
        if(fragil == 0){
            fragiles = true;
        }
        
        int id = paquetes.size()+1;
        
        Paquete newPaquete = new Paquete(tipoP, electro, fragiles, pesoT, id, descripcion);
        paquetes.add(newPaquete);
        locRemitente.agregarEnviado(newPaquete);
        locDestino.agregarRecibido(newPaquete);
        
        String pasoN = destinatario.pasoNivel(cantidadPaquetes);
        
        enviarCorreo(destinatario);
        
        return "Paquete enviado, el paquete posee el id " + id + "\r\n" + pasoN;
    }
    /**
     * Agrega el sobre al sistema y al locker del usuario, ademas envia un correo notificando que el usuario recibio un paquete
     * @param envia
     * @param recibe
     * @param descripcion
     * @param pesoT
     * @param empaque
     * @param tipo
     * @return 
     */
    public String agregarSobre(int envia, int recibe, String descripcion, int pesoT, int empaque, int tipo){
        Cliente remitente = getCliente(envia);
        Cliente destinatario = getCliente(recibe);
        Locker locRemitente = remitente.getCasillero();
        Locker locDestino = destinatario.getCasillero();
        
        TipoSobre tipoS = TipoSobre.Manila;
        if(tipo == 0){
            tipoS = TipoSobre.Aereo;
        }
        
        boolean esDoc = false;
        if(empaque == 0){
            esDoc = true;
        }
        
        int id = paquetes.size()+1;
        
        Sobre newSobre = new Sobre(tipoS, esDoc, pesoT, id, descripcion);
        paquetes.add(newSobre);
        locRemitente.agregarEnviado(newSobre);
        locDestino.agregarRecibido(newSobre);
        
        String pasoN = destinatario.pasoNivel(cantidadPaquetes);
        
        enviarCorreo(destinatario);
        
        return "Sobre enviada, sobre posee el id " + id + "\r\n" + pasoN;
    }
    /**
     * Agrega el revista al sistema y al locker del usuario, ademas envia un correo notificando que el usuario recibio un paquete
     * @param envia
     * @param recibe
     * @param descripcion
     * @param nombre
     * @param catalogo
     * @param tema
     * @return 
     */
    public String agregarRevista(int envia, int recibe, String descripcion, String nombre, int catalogo, int tema){
        Cliente remitente = getCliente(envia);
        Cliente destinatario = getCliente(recibe);
        Locker locRemitente = remitente.getCasillero();
        Locker locDestino = destinatario.getCasillero();
        
        TipoRevista[] tipos = TipoRevista.values();
        TipoRevista tipo = tipos[tema];
        
        boolean esCat = false;
        if(catalogo == 0){
            esCat = true;
        }
        
        int id = paquetes.size()+1;
        
        Revista newRevista = new Revista(nombre, esCat, tipo, id, descripcion);
        locRemitente.agregarEnviado(newRevista);
        locDestino.agregarRecibido(newRevista);
        
        String pasoN = destinatario.pasoNivel(cantidadPaquetes);
        
        enviarCorreo(destinatario);
        
        return "Revista enviada, revista posee el id " + id + "\r\n" + pasoN;
    }
    /**
     * Envia el correo al usuario en especifico que se desea enviar
     * @param destinatario 
     */
    private void enviarCorreo(Cliente destinatario){
        String paqs = getInfoRetirables(destinatario.getId());
        String correo = destinatario.getCorreo();
        String nombre = destinatario.getNombre();
        String casillero = String.valueOf(destinatario.getCasillero().getId());
        
        String mensaje = "Estimado " + nombre + "\r\n";
        mensaje += "Su casillero, id " + casillero + ", posee para retirar:\r\n";
        mensaje += paqs;
        
        EnvioMail envio = new EnvioMail(correo, "Estado de mensajeria", mensaje);
    }
    /**
     * Retorna, al ingresar el id del casillero, el mensaje con el estado del locker, si esta en uso o no
     * @param idL
     * @return 
     */
    public String estadoLocker(int idL){
        Locker actual = getLocker(idL);
        return estadoL(actual);
    }
    /**
     * Retorna, al ingresar el id del cliente, el mensaje con el estado del locker, si esta en uso o no
     * @param idC
     * @return 
     */
    public String estadoLockerC(int idC){
        Cliente actual = getCliente(idC);
        Locker clientLocker = actual.getCasillero();
        return estadoL(clientLocker);
    }
    /**
     * Crea el mensaje con el estado del locker ingresado
     * @param actual
     * @return 
     */
    private String estadoL(Locker actual){
        String mensaje = "El locker " + actual.getId();
        if(actual.isEstado()){
            mensaje += " esta ocupado";
        }else{
            mensaje += " esta libre";
        }
        return mensaje;
    }
    /**
     * Retorna la cantidad de paquetes que se necesitan para pasar de nivel
     * @return 
     */
    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }
    /**
     * Define la cantidad de paquetes que son necesarios para pasar de nivel
     * @param cantidadPaquetes 
     */
    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }
    /**
     * Retorna el nombre del sistema
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define el nombre del counter
     * @param nombre 
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna la cedula juridica del counter
     * @return 
     */
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }
    /**
     * Define la cedula juridica del counter
     * @param cedulaJuridica 
     */
    private void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }
    /**
     * Retorna la direccion del counter
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Define la direccion del counter
     * @param direccion 
     */
    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * devuelve la cantidad de casilleros que tiene el counter
     * @return 
     */
    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }
    /**
     * define la cantidad de casilleros del counter
     * @param cantidadCasilleros 
     */
    private void setCantidadCasilleros(int cantidadCasilleros) {
        this.cantidadCasilleros = cantidadCasilleros;
    }
    
}
