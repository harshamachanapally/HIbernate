package Splitwise;

import java.util.List;

import javax.persistence.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.cfg.Configuration;

@Entity
@Table (name = "friendslist")
public class FriendsList {
		@Id
		@GeneratedValue
		private int Friend_Id;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "Customer_userId") 
		private Customers Customer_userId;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "Friend_userId")
		private Customers Friend_userId;
		public int getFriend_Id() {
			return Friend_Id;
		}
		public void setFriend_Id(int friend_Id) {
			Friend_Id = friend_Id;
		}
		public Customers getCustomer_userId() {
			return Customer_userId;
		}
		public void setCustomer_userId(Customers i) {
			Customer_userId = i;
		}
		public Customers getFriend_userId() {
			return Friend_userId;
		}
		public void setFriend_userId(Customers friend_userId) {
			Friend_userId = friend_userId;
		}
		public List<FriendsList> getFriendsId(Customers customer,Customers customer1){
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("from FriendsList where Customer_userId in( "+customer.getUserId()+","+customer1.getUserId()+")" +"and Friend_userId in( "+customer.getUserId()+","+customer1.getUserId()+")");
			List<FriendsList> friends = (List<FriendsList>) query.list();
			session.getTransaction().commit();
			session.close();
			return friends;
		}
		public FriendsList getOneFriendsId(Customers customer,Customers customer1){
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("from FriendsList where Customer_userId in( "+customer.getUserId()+")" +"and Friend_userId in( "+customer1.getUserId()+")");
			List<FriendsList> friends = (List<FriendsList>) query.list();
			session.getTransaction().commit();
			session.close();
			return friends.get(0);
		}
}
