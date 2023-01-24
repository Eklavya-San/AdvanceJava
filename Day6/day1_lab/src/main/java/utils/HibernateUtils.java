package utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
	private static SessionFactory factory;
	static {
		System.out.println("In static intitalizer block of hyber utils");
		//build singleton immutable third safe sf seesion factory
		factory = new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	
	
}
