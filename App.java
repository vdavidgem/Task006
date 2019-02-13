package Com.gem.Demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import comgemdemoHip.Employee;
import comgemdemoHip.EmployeeName;

public class App {

	public static void main(String[] args) {

		EmployeeName an = new EmployeeName();

		an.setFname("G");
		an.setLname("V");
		an.setMname("david");

		Employee david = new Employee();
		david.setAdi(335);
		david.setColour("blu");
		david.setAname(an);
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(david);

		tx.commit();

		System.out.println(david);
	}

}
