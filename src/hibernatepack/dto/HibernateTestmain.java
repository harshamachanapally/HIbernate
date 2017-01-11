package hibernatepack.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Splitwise.Transaction;

public class HibernateTestmain {
public static void main(String[] args) {
	
	Vehicle vehicle = new Vehicle();
	Vehicle twowheel = new TwoWheeler();
	FourWheeler fourwheel = new FourWheeler();
	vehicle.setVehicleName("Vehicle");
	twowheel.setVehicleName("Twowheeler2");
	//twowheel.setSteeringHandle("SteeringHandle");
	fourwheel.setVehicleName("Fourwheeler");
	fourwheel.setSteeringWheel("SteeringWheel"); 
	Vehicle vehicle1 = new Vehicle();
	vehicle1.setVehicleName("New Vehicle");
	try{
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(twowheel);
	session.getTransaction().commit();
	//vehicle.setVehicleName("vehicle changed");
	session.close();
		
	}
	catch(Exception e){ 
		System.out.println(e.getMessage());
	}
}
}
