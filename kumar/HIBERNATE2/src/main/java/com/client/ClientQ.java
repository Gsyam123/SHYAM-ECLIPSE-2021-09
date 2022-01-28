package com.client;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answers;
import com.entity.Questions;

public class ClientQ {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Questions q1 = new Questions();
		q1.setName("what is java");
		q1.setId(1);

		Answers a = new Answers();
		a.setAnswername("java is a programming language");
		a.setPostesdBy("syam");

		Answers a1 = new Answers();
		a1.setAnswername("java is a platform");
		a1.setPostesdBy("syamkumar");

		Answers a2 = new Answers();
		a2.setAnswername("servlets is an interface");
		a2.setPostesdBy("diwaker");

		Answers a3 = new Answers();
		a3.setAnswername("servlet is api");
		a3.setPostesdBy("paide");

		ArrayList<Answers> list1 = new ArrayList<Answers>();
		list1.add(a);
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);

		q1.setAnswers(list1);

		s.save(q1);
		tx.commit();
		s.close();
	}
}
