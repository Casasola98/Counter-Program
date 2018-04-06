
package domain;

import bccrRequest.TipoCambio;
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
    private ArrayList<Integer> disponibles;
    private ArrayList<Mail> aRetirar;
    private ArrayList<Mail> seRetiran;
    private Factura facturaActual;
    private TipoCambio cambioDolar;

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
        crearDisponibles();
    }
    
    public String infoCliente(int idC){
        Cliente actual = getCliente(idC);
        return actual.obtenerInformacion();
    }
    
    public String[] infoCliente2(int idC){
        Cliente actual = getCliente(idC);
        return actual.obtenerDatos();
    }
    
    public boolean hayLockers(){
        if(disponibles.size() > 0 ){
            return true;
        }
        return false;
    }
    
    public String retirarTodos(){
        String mensaje = "";
        cambioDolar = new TipoCambio();
        facturaActual = new Factura(aRetirar, cambioDolar.getVenta());
        mensaje = facturaActual.calcularCosto();
        return mensaje;
    }
    
    public String retirarElegidos(){
        String mensaje = "";
        cambioDolar = new TipoCambio();
        facturaActual = new Factura(seRetiran, cambioDolar.getVenta());
        mensaje = facturaActual.calcularCosto();
        return mensaje;
    }
    
    private void crearDisponibles(){
        int numero;
        for(int number = 0; number < cantidadCasilleros; number++){
            numero = 1000 + number;
            disponibles.add(numero);
        }
    }
    
    public boolean existeCliente(int pUser){
        for(Cliente usuario : clientes){
            if(usuario.getId() == pUser){
                return true;
            }
        }
        return false;
    }
    
    public boolean existeLocker(int pLocker){
        for(Locker casillero : casilleros){
            if(casillero.getId() == pLocker){
                return true;
            }
        }
        return false;
    }
    
    public boolean lockerEnUso(int pLocker){
        for(int casillero : disponibles){
            if(casillero == pLocker){
                return false;
            }
        }
        return true;
    }
    
    public boolean existeMail(int pPaquete){
        for(Mail paquete : paquetes){
            if(paquete.getId() == pPaquete){
                return true;
            }
        }
        return false;
    }
    
    private Cliente getCliente(int pUser){
        for(Cliente usuario : clientes){
            if(usuario.getId() == pUser){
                return usuario;
            }
        }
        return null;
    }
    
    private Locker getLocker(int pLocker){
        for(Locker casillero : casilleros){
            if(casillero.getId() == pLocker){
                return casillero;
            }
        }
        return null;
    }
    
    private Mail getMail(int pPaquete){
        for(Mail paquete : paquetes){
            if(paquete.getId() == pPaquete){
                return paquete;
            }
        }
        return null;
    }
    
    private Mail getRetira(int idM){
        for(Mail paquete : aRetirar){
            if(paquete.getId() == idM){
                return paquete;
            }
        }
        return null;
    }
    
    private void getRetirables(int idCliente){
        Cliente usuario = getCliente(idCliente);
        Locker casillero = usuario.getCasillero();
        aRetirar = casillero.getRetirables();
        seRetiran = new ArrayList();
    }
    
    public String getInfoRetirables(int idCliente){
        String mensaje = "";
        getRetirables(idCliente);
        for(Mail retirar: aRetirar){
            mensaje += retirar.toString() + "\r\n";
        }
        return mensaje;
    }
    
    public boolean esRetirable(int idM){
        for(Mail retira: aRetirar){
            if(idM == retira.getId())
                return true;
        }
        return false;
    }
    
    public boolean seRetira(int idM){
        for(Mail retira: seRetiran){
            if(idM == retira.getId())
                return false;
        }
        return true;
    }
    
    public void addRetirar(int idM){
        seRetiran.add(getRetira(idM));
    }
    
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
    
    public void editarCliente(int id, String nombre, String correo, String telefono, String direccion, int genero, String fechaNacimiento){
        Date fecha = InfoReview.crearFecha(fechaNacimiento);
        Genero actualG = Genero.Femenino;
        if(genero == 0){
            actualG = Genero.Masculino;
        }
        Cliente elCliente = getCliente(id);
        elCliente.editarDatos(nombre, correo, telefono, direccion, actualG, fecha);
    }
    
    public void borrarCliente(int id){
        Cliente elCliente = getCliente(id);
        Locker elLocker = elCliente.getCasillero();
        disponibles.add(elLocker.getId());
        elLocker.cambiarEstado();
        elLocker.resetearPaquetes();
        clientes.remove(elCliente);
    }
 
    public Locker agregarCasillero(){
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
        
        enviarCorreo(destinatario);
        
        return "Paquete enviado, el paquete posee el id " + id;
    }
    
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
        
        enviarCorreo(destinatario);
        
        return "Sobre enviada, sobre posee el id " + id;
    }
    
    private void enviarCorreo(Cliente destinatario){
        String paqs = getInfoRetirables(destinatario.getId());
        String correo = destinatario.getCorreo();
        String nombre = destinatario.getNombre();
        String casillero = String.valueOf(destinatario.getCasillero().getId());
        
        String mensaje = "Estimado " + nombre + "\r\n";
        mensaje += "Su casillero, id " + casillero + "posee para retirar:\r\n";
        mensaje += paqs;
        
        EnviarMail envio = new EnviarMail(correo, "Ha recibido mensajeria", mensaje);
    }
    
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
        
        enviarCorreo(destinatario);
        
        return "Revista enviada, revista posee el id " + id;
    }
    
    public String estadoLocker(int idL){
        Locker actual = getLocker(idL);
        String mensaje = "El locker " + actual.getId();
        if(actual.isEstado()){
            mensaje += " esta ocupado";
        }else{
            mensaje += " esta libre";
        }
        return mensaje;
    }
    
    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }
    
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    private void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    private void setCantidadCasilleros(int cantidadCasilleros) {
        this.cantidadCasilleros = cantidadCasilleros;
    }
    
}
