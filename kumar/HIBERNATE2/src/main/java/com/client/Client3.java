package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Emp;

public class Client3 {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Emp e = new Emp();
		e.setName("syam");
		e.setEmail("hkhghjcj");

		Address a = new Address();
		a.setCity("cgf");
		a.setState("dssd");
		a.setPincode(987);

		e.setAdd(a);
		a.setE(e);
		s.save(e);
		tx.commit();
		s.close();
		//System.out.println("success");
	}
}
