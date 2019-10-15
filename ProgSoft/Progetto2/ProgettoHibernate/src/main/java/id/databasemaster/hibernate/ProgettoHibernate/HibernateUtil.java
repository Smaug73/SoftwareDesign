package id.databasemaster.hibernate.ProgettoHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
  private static final SessionFactory sessionFactory= buildSessionFactory();
 
  private static SessionFactory buildSessionFactory() {
    try {
      // Create the SessionFactory from hibernate.cfg.xml
      //Configuration configuration= new Configuration().configure();
      //StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      //return configuration.buildSessionFactory(builder.build());
      
    	
    	/*
    	 * Per hibernate 5 si crea in questo modo la Factory
    	 */
    	StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
                .build();
    	Metadata metadata = new MetadataSources(standardServiceRegistry)
            .getMetadataBuilder().build();
    	return metadata.getSessionFactoryBuilder().build();
    
    
    
    } catch (Throwable ex) {
      // Make sure you log the exception, as it might be swallowed
      System.err.println("SESSION FACTORY BUILD FAILED:" + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
 
  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
 
  public static void shutdown() {
    // Close caches and connection pools
    getSessionFactory().close();
  }
}