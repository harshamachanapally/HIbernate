package Splitwise;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity 
@Table (name = "CustomerDetails")
@NamedQuery(name = "Customers.byemail", query = "from Customers c where c = ?")
public class Customers {
	@Id 
	@GeneratedValue
	private int userId;
	private String name;
	private String email;
	@ManyToMany
	@JoinTable(name="FriendsList",joinColumns = @JoinColumn(name="Customer_userId"),
			   uniqueConstraints = @UniqueConstraint(columnNames = {"Friend_userId", "Customer_userid"}))
	@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	@CollectionId(columns = {@Column(name="Friend_Id")}, generator = "sequence-gen", type = @Type(type= "int"))
	private Collection<Customers> Friend = new ArrayList<Customers>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Customers> getFriend() {
		return Friend;
	}
	public void setFriend(Collection<Customers> friend) {
		Friend = friend;
	}
	public void addfriends(Customers customer,Customers friend){
			customer.getFriend().add(friend);
			friend.getFriend().add(customer);
		
	}
	
}
