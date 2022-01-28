package com.client;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Employe;

public class Client1 {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		// Transaction tx = s.beginTransaction();

//		Employe e = new Employe();
//		e.setId(6);
//		e.setName("Sai");
//		e.setSalary(670000);
//		e.setAddress("narsaraopet");
//		e.setAge(26);
//		s.merge(e);
//
//		Employe e1 = new Employe();
//		e1.setId(8);
//		e1.setName("Gsyamkumar");
//		e1.setSalary(799999);
//		e1.setAddress("chirala");
//		e1.setAge(25);
//		s.merge(e1);
//		
//		
//		Employe e2=new Employe();
//		e2.setName("dp");
//		e2.setSalary(876909);
//		e2.setAddress("guntur");
//		e2.setAge(27);
//		s.save(e2);
//		tx.commit();
//		s.close();
//
//		Employe e = (Employe) s.load(Employe.class, 10);
//		System.out.println(e);
//		
//
//		Query query = s.createQuery("from Employe e where e.id=8");
//		List<Employe> list = query.list();
//		System.out.println(list);

		Criteria c = s.createCriteria(Employe.class);
		c.add(Restrictions.like("name","d%"));
        List<Employe> list = c.list();
		System.out.println(list);

	}
}
