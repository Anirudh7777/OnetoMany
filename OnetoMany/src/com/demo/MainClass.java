package com.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OnetoMany");

		EntityManager manager = factory.createEntityManager();
		
		List<Person> p = new ArrayList();
		
		Person p1 = new Person();
		p1.setFirstName("Anirudh");
		p1.setLastName("Chaganty");
		
		Person p2 = new Person();
		p2.setFirstName("Mahesh");
		p2.setLastName("Gone");
		
		Department dept = new Department();
		dept.setTitle("Healthcare");
		
		p1.setDept(dept);
		p2.setDept(dept);
		
		p.add(p1);
		p.add(p2);
		
		dept.setPerson(p);
		
		try {
			
			
			/*
			 * Department dept1 = manager.find(Department.class, 1L);
			 * System.out.println(dept1);
			 */
			  
			  Person p3 = manager.find(Person.class, 2L);
			  System.out.println(p3);
			  System.out.println(p3.getDept().getEmployee());
			  //System.out.println(empp.toString());
			 
			
			
			
			/*
			 * manager.getTransaction().begin();
			 * 
			 * manager.persist(dept);
			 * 
			 * manager.getTransaction().commit();
			 */
			 
			 
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}

	}

}
