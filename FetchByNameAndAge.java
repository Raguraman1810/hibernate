package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByNameAndAge {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select u.name,u.age from User u");
		
		List <Object[]> ls = q.getResultList();
		
		for(Object [] a : ls ){
			System.out.println("Name :" + a[0] + ";  Age :" + a[1] );
		}
	}

}
