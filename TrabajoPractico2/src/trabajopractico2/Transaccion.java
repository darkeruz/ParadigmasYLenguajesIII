
package trabajopractico2;

import java.util.ArrayList;

public class Transaccion {
    
    private Integer n_de_operacion; 
    private String descripcion_reserva; 
    private Float monto; 
    private String forma_de_pago; 
    
    

    //CONSTRUCTOR
    public Transaccion(Integer n_de_operacion, String descripcion_reserva, Float monto, String forma_de_pago) {
        this.n_de_operacion = n_de_operacion;
        this.descripcion_reserva = descripcion_reserva;
        this.monto = monto;
        this.forma_de_pago = forma_de_pago;
    }
   
    
    //GETTERS Y SETTERS 
    public Integer getN_de_operacion() {
        return n_de_operacion;
    }

    public void setN_de_operacion(Integer n_de_operacion) {
        this.n_de_operacion = n_de_operacion;
    }

    public String getDescripcion_reserva() {
        return descripcion_reserva;
    }

    public void setDescripcion_reserva(String descripcion_reserva) {
        this.descripcion_reserva = descripcion_reserva;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }
    
    
    
}
