package edu.csus.csc191.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class HibernateUtil {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory ;

    private static SessionFactory buildSessionFactory() {
        try {

            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("/META-INF/hibernate.cfg.xml");

            Properties props = PropertiesLoaderUtils.loadAllProperties("csc191.properties");
             configuration.setProperties(props);
             configuration.setProperty("hibernate.dialect", props.getProperty("hibernate.Dialect"));
             configuration.setProperty("hibernate.connection.driver_class", props.getProperty("dataSource.driverClassName"));
             configuration.setProperty("hibernate.connection.url", props.getProperty("dataSource.url"));
             configuration.setProperty("hibernate.connection.username", props.getProperty("dataSource.username"));
             configuration.setProperty("hibernate.connection.password", props.getProperty("dataSource.password"));

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return buildSessionFactory();
    }

    static {
        System.out.println(" -- Initializing HibernateUtil.");
    }
}
