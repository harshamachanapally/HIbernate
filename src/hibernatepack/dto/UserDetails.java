package hibernatepack.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity 
@Table (name="User_Details2")     
public class UserDetails {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	//@OneToMany (mappedBy = "user",cascade = CascadeType.PERSIST)
	@OneToMany (cascade = CascadeType.PERSIST)
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	/*@Temporal(TemporalType.DATE)
	private Date date;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="User_Address2",joinColumns = @JoinColumn(name="UserId"))
	@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	@CollectionId(columns = {@Column(name="Address_Id")}, generator = "sequence-gen", type = @Type(type= "int"))
	
	Collection<Address> ListofAddress = new ArrayList<Address>();
	@Lob
	private String description;*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	*/	
}
