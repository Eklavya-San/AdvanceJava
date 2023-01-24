package dao;

import org.hibernate.*;
import static utils.HibernateUtils.getFactory;
import pojos.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String addEmpDetails(Employee newEmp) {
		// TODO Auto-generated method stub
		//1.get Session from SF (session factory)
		Session session = getFactory().getCurrentSession();
		Transaction tx =session.beginTransaction();
		try {
			//Session API : public Serializable save(Object  trasientObjRef) throws 
			//HibernateException 
			Long empId = (Long)session.save(newEmp);
			tx.commit();
			String mesg = "Added emp details ,Id = "+empId;
		} catch (RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
				//rethrow same exc to the caller so that caller will know about the error
				throw e;
			}
			// TODO: handle exception
		}
		
		return mesg;
	}

}
