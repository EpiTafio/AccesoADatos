package entidad;
// Generated 27-dic-2016 1:15:37 by Hibernate Tools 4.3.1



/**
 * Proveedores generated by hbm2java
 */
public class Proveedores  implements java.io.Serializable {


     private String codigo;
     private String nombre;
     private String apellidos;
     private String direccion;

    public Proveedores() {
    }

    public Proveedores(String codigo, String nombre, String apellidos, String direccion) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.direccion = direccion;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}


