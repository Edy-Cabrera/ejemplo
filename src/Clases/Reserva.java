
package Clases;

import java.io.Serializable;

public class Reserva  implements Serializable {
 
   private String Correlativo;
   private String Huesped;
   private String Habitacion;
   private String FechaHora;

    public void setCorrelativo(String Correlativo) {
        this.Correlativo = Correlativo;
    }

    public void setHuesped(String Huesped) {
        this.Huesped = Huesped;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public void setFechaHora(String FechaHora) {
        this.FechaHora = FechaHora;
    }

    public String getCorrelativo() {
        return Correlativo;
    }

    public String getHuesped() {
        return Huesped;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public String getFechaHora() {
        return FechaHora;
    }
    
    
}
