
package trabajopractico2;

public class Simple extends Habitacion implements ServicioHabitacion {

    public Simple(Integer capacidad_personas) {
        super(capacidad_personas);
    }

    @Override
    public void brindar_servicio() {
        System.out.println("Servicios Limitados.");
    }
    
}
