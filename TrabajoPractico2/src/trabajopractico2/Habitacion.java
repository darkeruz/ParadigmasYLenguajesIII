
package trabajopractico2;

public class Habitacion {
    
    private Integer capacidad_personas; 
    private Cliente cliente;
    private Transaccion transaccion;

    public Habitacion(Integer capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }
    
    
    

    public Integer getCapacidad_personas() {
        return capacidad_personas;
    }

    public void setCapacidad_personas(Integer capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }
    
    
    
}
