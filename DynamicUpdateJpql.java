package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateJpql {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.next();
		System.out.println("enter the age :");
		int age = sc.nextInt();
		System.out.println("Enter gender:");
		String gender = sc.next();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q = em.createQuery("Update User u set u.age=?1,u.gender=?2 where u.name=?3");
		q.setParameter(1, age);
		q.setParameter(2 , gender);
		q.setParameter(3, name);
		q.executeUpdate();
		et.commit();
		System.out.println("data Updated");
	}

}
