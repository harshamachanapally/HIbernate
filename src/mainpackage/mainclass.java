package mainpackage;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Sample.Movie;
import Sample.Screen;
import Sample.Shows;
import Sample.Theater;



public class mainclass {
	public static void main(String[] args) throws ParseException {
		/*Screen s = new Screen();
		Show sh = new Show();
		sh.setCheck(true);
		sh.setShowId(1);*/
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*session.beginTransaction();
		s = session.get(Screen.class, 1);
		
		session.save(sh);*/
		/*Query query = session.createQuery("from Screen where screenId = ?");
		query.setInteger(0, 1);
		List<Screen> screen = query.list();
		s.setScreen(screen.get(0));
		System.out.println(s.getScreen().getScreenId());
		session.save(s);
		*//*session.save(m);
		session.save(t);
		session.save(t1);*/
		//session.getTransaction().commit();
		session.close();
	}
}
