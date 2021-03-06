package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bike;

public class Client2 {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Bike b = new Bike();
		b.setColour("Green");
		b.setNumber(8734);
		b.setCc(120);
		
		s.save(b);
		tx.commit();
		s.close();
		
	}
}
