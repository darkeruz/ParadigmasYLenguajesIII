
package trabajopractico2;

import java.util.ArrayList;


public class Cliente {
    
    private String nombre;
    
    
    //CONSTRUCTOR
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    
    private ArrayList<Transaccion> transacciones;

    public int sizeTransacciones() {
        return transacciones.size();
    }

    public boolean addTransaccion(Transaccion transaccion) {
        return transacciones.add(transaccion);
    }

    public boolean removeTransaccion(Transaccion transaccion) {
        return transacciones.remove(transaccion);
    }

    public void clearTransacciones() {
        transacciones.clear();
    }
    
    
    public void hospedarse(){
        System.out.println("Me estoy hospedando");     
    }
    
    public void hospedaje_cancelar_operacion(){
        System.out.println("Decidi cancelar mi solicitud de habitacion");
    }
        
//GETTERS Y SETTERS 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
