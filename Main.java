package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		User u = new User();
		
		u.setName("Ekmbaram");
		u.setAge(50);
		u.setGender("Male");
		u.setId(5);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		em.persist(u);
		et.commit();
		
		
		System.out.println("Data Saved");
		
		
	}

}
