package com.hibernate.controller;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Employee1;
@RestController
public class EmployeeController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("addEmployee")
	public void addEmployee(@RequestBody Employee1[] employee) {
		

		Session session=sessionFactory.openSession();
		
		for(Employee1 employee1: employee) {
			Transaction tx=session.beginTransaction();
			session.save(employee1);
		   tx.commit();
		
		}

	}	

}
