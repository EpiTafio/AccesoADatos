package entidad;
// Generated 27-dic-2016 1:15:37 by Hibernate Tools 4.3.1



/**
 * Gestion generated by hbm2java
 */
public class Gestion  implements java.io.Serializable {


     private GestionId id;
     private float cantidad;

    public Gestion() {
    }

    public Gestion(GestionId id, float cantidad) {
       this.id = id;
       this.cantidad = cantidad;
    }
   
    public GestionId getId() {
        return this.id;
    }
    
    public void setId(GestionId id) {
        this.id = id;
    }
    public float getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }




}

