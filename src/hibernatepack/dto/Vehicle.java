package hibernatepack.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
@Entity
	@Inheritance (strategy = InheritanceType.JOINED)
// @org.hibernate.annotations.Entity(selectBeforeUpdate= true)
public class Vehicle {
@Id @GeneratedValue
private int Id;
private String VehicleName;
/*
//@ManyToMany(mappedBy = "vehicle")
 @ManyToOne 
 @JoinColumn( name = "UserId")
 @NotFound (action = NotFoundAction.IGNORE)
 private UserDetails user;
 public UserDetails getUser() {
	return user;
}
public void setUser(UserDetails user) {
	this.user = user;
}
/*
private Collection<UserDetails> UserList = new ArrayList<UserDetails>();
public Collection<UserDetails> getUserList() {
	return UserList;
}
public void setUserList(Collection<UserDetails> userList) {
	UserList = userList;
}
*/
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getVehicleName() {
	return VehicleName;
}
public void setVehicleName(String vehicleName) {
	VehicleName = vehicleName;
}

}
