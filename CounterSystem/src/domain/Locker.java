
package domain;

import java.util.ArrayList;

/**
 *
 * @author Admin
 * Corresponde a la clase que representa los casilleros del sistema del Counter
 */
public class Locker {
    
    private int id;
    private boolean estado;
    private ArrayList<Mail> recibidos;
    private ArrayList<Mail> enviados;

    /**
     * Constructor, recibe el id del locker que iran de 1000 en adelante
     * @param id
     */
    public Locker(int id) {
        setId(id);
        setEstado(true);
        recibidos = new ArrayList();
        enviados = new ArrayList();
    }
    /**
     * Retorna el estado del casillero, si esta ocupado por un usuario o no
     * @return
     */
    public boolean isEstado() {
        return estado;
    }
    /**
     * Otorga el valor al estado
     * @param estado 
     */
    private void setEstado(boolean estado) {
        this.estado = estado;
    }
    /**
     * Retorna el ID del casillero
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Otorga el id al casillero
     * @param id 
     */
    private void setId(int id) {
        this.id = id;
    }    
    /**
     * Retorna el total de paquetes que han sido recibidos por el usuario que utiliza el casillero
     * @return 
     */
    public int totalRecibidos(){
        return recibidos.size();
    }
    
    /**
     *Resetea las listas de paquetes recibidos y enviados, esto en caso de que el casillero haya sido desocupado
     */
    public void resetearPaquetes(){
        recibidos = new ArrayList();
        enviados = new ArrayList();
    }
    /**
     * Retorna una lista con los paquetes que ha recibido en el casillero y que no ha retirado
     * @return 
     */
    public ArrayList<Mail> getRetirables(){
        ArrayList<Mail> retira = new ArrayList();
        for(Mail posible: recibidos){
            if(! posible.isEstado())
                retira.add(posible);
        } 
        return retira;
    }
    /**
     * Retorna la cantidad de paquetes que ha recibido
     * @return 
     */
    public int cantidadRetirables(){
        return getRetirables().size();
    }
    /**
     * Agrega el objeto Mail(Paquete, sobre o revista) a la lista de recibidos
     * @param recibido 
     */
    public void agregarRecibido(Mail recibido){
        recibidos.add(recibido);
    }
    /**
     * Agrega el objeto Mail(Paquete, sobre o revista) a la lista de enviados
     * @param enviado 
     */
    public void agregarEnviado(Mail enviado){
        enviados.add(enviado);
    }
    /**
     * Cambia el estado del casillero, en caso de que se desocupe o vuelva a ocupar
     */
    public void cambiarEstado(){
        estado = !estado;
    }
    
}
