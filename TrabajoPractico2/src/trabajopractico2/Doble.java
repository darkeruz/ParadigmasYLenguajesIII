
package trabajopractico2;

public class Doble extends Habitacion implements ServicioHabitacion {

    public Doble(Integer capacidad_personas) {
        super(capacidad_personas);
    }

    @Override
    public void brindar_servicio() {
        System.out.println("Servicios limitados");
    }
    
    
    
}
