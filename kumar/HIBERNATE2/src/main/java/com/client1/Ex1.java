package com.client1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity1.ContractEmp;
import com.entity1.Emp;
import com.entity1.RegularEmp;

public class Ex1 {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Emp e1 = new Emp();
		e1.setName("syamkumar");

		RegularEmp r1 = new RegularEmp();
		r1.setSalary(700000);
		r1.setBonus(100000);

		ContractEmp c1 = new ContractEmp();
		c1.setPayperhour(500);
		c1.setContractduration(6);

		s.save(c1);
		s.save(r1);
		s.save(e1);

		tx.commit();
		s.close();

	}
}
