package Splitwise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity 
@Table (name = "transaction")
@NamedQuery (name = "Transaction.byFriendId", query = "from Transaction where Friend_Id in (?)")
public class Transaction {
	@Id
	@GeneratedValue
	private int TranId;
	private int ReceiptId;
	@ManyToOne
	@JoinColumn(name = "Friend_Id")
	private FriendsList Friend_Id;
	@ManyToOne
	@JoinColumn(name = "AddedBy")
	private Customers Addedby;
	private boolean Type;
	private float Amount;
	private String Description;
	public int getTranId() {
		return TranId;
	}
	public void setTranId(int tranId) {
		TranId = tranId;
	}
	public int getReceiptId() {
		return ReceiptId;
	}
	public void setReceiptId(int receiptId) {
		ReceiptId = receiptId;
	}
	public FriendsList getFriend_Id() {
		return Friend_Id;
	}
	public void setFriend_Id(FriendsList friend_Id) {
		Friend_Id = friend_Id;
	}
	public Customers getAddedby() {
		return Addedby;
	}
	public void setAddedby(Customers addedby) {
		Addedby = addedby;
	}
	public boolean isType() {
		return Type;
	}
	public void setType(boolean type) {
		Type = type;
	}
	public boolean getType() {
		return Type;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
