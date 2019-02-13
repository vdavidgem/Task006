package Com.gem.Demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee1 {

	public static void main(String[] args) {

		Empoloyetaple david = new Empoloyetaple();
		david.setAdi(445);
		david.setAname("mathavie");
		david.setColor("yellow");

		Configuration con = new Configuration().configure().addAnnotatedClass(Empoloyetaple.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(david);
		tx.commit();
	}

	private static void beginTansaction() {
		// TODO Auto-generated method stub

	}
}
