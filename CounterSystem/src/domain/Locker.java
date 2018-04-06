
package domain;

import java.util.ArrayList;

public class Locker {
    
    private int id;
    private boolean estado;
    private ArrayList<Mail> recibidos;
    private ArrayList<Mail> enviados;

    public Locker(int id) {
        setId(id);
        setEstado(true);
        recibidos = new ArrayList();
        enviados = new ArrayList();
    }

    public void resetearPaquetes(){
        recibidos = new ArrayList();
        enviados = new ArrayList();
    }
    
    public ArrayList<Mail> getRetirables(){
        ArrayList<Mail> retira = new ArrayList();
        for(Mail posible: recibidos){
            if(! posible.isEstado())
                retira.add(posible);
        } 
        return retira;
    }
    
    public void agregarRecibido(Mail recibido){
        recibidos.add(recibido);
    }
    
    public void agregarEnviado(Mail enviado){
        enviados.add(enviado);
    }
    
    public void cambiarEstado(){
        estado = !estado;
    }
    
    public boolean isEstado() {
        return estado;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }    
}
