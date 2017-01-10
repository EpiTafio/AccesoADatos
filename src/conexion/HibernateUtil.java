package conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final ThreadLocal session = new ThreadLocal();
    
  

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            Configuration config = new Configuration().configure();
            ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).build();
            sessionFactory = config.buildSessionFactory(sr);
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
           
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session getCurrentSession(){
        Session s = (Session) session.get();
        if(s== null || !s.isOpen()){
            s = sessionFactory.openSession();
        }
        session.set(s);
        return s;
    }
    public static void CloseSession(){
        Session s = (Session) session.get();
        if(s != null || s.isOpen()){
            s.close();
        }
        session.set(s);
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
}
