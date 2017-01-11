package hibernatepack.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateStudentmain {
	public static void main(String[] args) {
	
		student s1 = new student("Harsha","chaitanya","hrshchaitanya@gmail.com");
		SessionFactory sessionfactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(student.class).buildSessionFactory();
		Session session1 = sessionfactory.getCurrentSession();
		try{
		session1.beginTransaction();
		session1.save(s1);
		session1.getTransaction().commit();
		}
		finally{
			sessionfactory.close();
		}
	
		
	}
}
