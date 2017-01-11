package Splitwise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "transummary")
@NamedQuery(name = "transummary.byfriendid", query = "select sum(Amount) from transummary where friend_id in (:trans)")
public class transummary {
	@Id
	private int friend_id;
	private float Amount;
	public int getFriend_id() {
		return friend_id;
	}
	public float getAmount() {
		return Amount;
	}
}
