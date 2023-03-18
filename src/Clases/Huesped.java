
package Clases;

import java.io.Serializable;


public class Huesped implements Serializable{
    
    private String Codigo;
    private String Nombre;
    private String Correo;
    private String Telefono;
    private String Nit;
private String Nit2;

    public String getNit2() {
        return Nit2;
    }

    public void setNit2(String Nit2) {
        this.Nit2 = Nit2;
    }


    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNit() {
        return Nit;
    }
    
    
    
    
}
