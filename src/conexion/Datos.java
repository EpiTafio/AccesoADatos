package conexion;

import entidad.Piezas;
import entidad.Proveedores;
import entidad.Proyectos;
import org.hibernate.Session;

/**
 * @author Kepa I. González Romero
 */
public class Datos {

    // constructor vacio
    public Datos() {
    }

    ////////////////////
    //  PROVEEDORES  //
    ///////////////////
    // Consulta
    public Proveedores obtenerProv(String id) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        Proveedores result = (Proveedores) s.get(Proveedores.class, id);
        s.getTransaction().commit();
        s.close();
        return result;
    }

    // ALTA
    public void altaProveedor(Proveedores prov) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.save(prov);
        s.getTransaction().commit();
        s.close();
    }

    // BAJA
    public void bajaProveedor(Proveedores prov) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.delete(prov);
        s.getTransaction().commit();
        s.close();
    }
    /////////////
    //  PIEZAS  //
    //////////////

    // Consulta
    public Piezas obtenerPieza(String id) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        Piezas result = (Piezas) s.get(Piezas.class, id);
        s.getTransaction().commit();
        s.close();
        return result;
    }

    // ALTA
    public void altaPieza(Piezas pieza) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.save(pieza);
        s.getTransaction().commit();
        s.close();
    }

    // BAJA
    public void bajaPiezas(Piezas pieza) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.delete(pieza);
        s.getTransaction().commit();
        s.close();
    }
    ////////////////
    //  PROYECTOS  //
    /////////////////

    // Consulta
    public Proyectos obtenerProyecto(String id) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        Proyectos result = (Proyectos) s.get(Proyectos.class, id);
        s.getTransaction().commit();
        s.close();
        return result;
    }

    // ALTA
    public void altaProyecto(Proyectos proyecto) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.save(proyecto);
        s.getTransaction().commit();
        s.close();
    }

    // BAJA
    public void bajaProyecto(Proyectos proyecto) {
        Session s = HibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.delete(proyecto);
        s.getTransaction().commit();
        s.close();
    }

}
