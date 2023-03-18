
package Clases;

import java.io.Serializable;


public class Habitacion implements Serializable{
   
    private String Codigo;
    private String Nombre;
    private String Capacidad;
    private String Descripcion;

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
    
}
