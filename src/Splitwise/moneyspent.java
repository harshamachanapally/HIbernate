package Splitwise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "moneyspent")
@NamedQuery(name = "moneyspent.byuserId", query = "select s from moneyspent s inner join Customers c on s.userId=c.userId where c.email = :email") 
public class moneyspent {
	@Id
	private int userId;
	private float Amount;
	public int getUserId() {
		return userId;
	}
	public float getAmount() {
		return Amount;
	}
	
	
}
