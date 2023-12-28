package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchOnlyName {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select u.name from User u");
		
		List <String> ls = q.getResultList();
		
		for( String a : ls ) {
		System.out.println("Name: " +  a);
		}
	}	

}
