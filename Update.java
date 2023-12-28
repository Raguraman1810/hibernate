package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
		
		User u = new User();
		
		u.setName("Ragu");
		u.setAge(22);
		u.setGender("Male");
		u.setId(2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		em.merge(u);
		et.commit();
		
		
		System.out.println("Data Updated");
		
  }

}
