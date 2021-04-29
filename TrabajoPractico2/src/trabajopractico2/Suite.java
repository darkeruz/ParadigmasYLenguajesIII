
package trabajopractico2;


public class Suite extends Habitacion implements ServicioHabitacion {

    public Suite(Integer capacidad_personas) {
        super(capacidad_personas);
    }

    @Override
    public void brindar_servicio() {
        System.out.println("Cuenta con servicios completos.");
    }
    
    
}
