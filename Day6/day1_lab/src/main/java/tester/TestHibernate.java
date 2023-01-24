package tester;
import static utils.HibernateUtils.getFactory;

import org.hibernate.SessionFactory;
public class TestHibernate {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()){
		System.out.println("hybernate is running");	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			<mapping class="pojos.User" />
		}
	}

}
