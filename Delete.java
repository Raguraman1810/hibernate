package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User u = em.find(User.class, 2);
		
		if(u != null) {
			et.begin();
			em.remove(u);
			et.commit();
			
			System.out.println("data deleted");
		}else {
			System.out.println("id not found");
		}
			
	}

}
