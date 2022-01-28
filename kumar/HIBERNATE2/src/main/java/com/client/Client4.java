package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.entity.Engine;

public class Client4 {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Car c=new Car();
		c.setColour("red");
		c.setCc(1800);
		c.setNumber("ap27-1234");
		
		Engine e=new Engine();
		e.setModelno(9160);
		e.setType("petrol");

		c.setEng(e);
		e.setC(c);
		s.save(c);
		tx.commit();
		s.close();
		
		System.out.println("sss");

	}
}
