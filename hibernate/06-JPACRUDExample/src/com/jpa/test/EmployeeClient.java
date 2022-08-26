package com.jpa.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.beans.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		 
		
		
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACRUD");
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname=sc.next();
		
		/* Create  Entity */
		Employee employee = new Employee();
		   
		   employee.setFirstname(fname);
		   employee.setLastname("Kumar");
		   employee.setEmail("Mohan@gmail.com");
		   employee.setEmpId(15);
 
		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();
 
		/* Persist entity */
		System.out.println("Insert Record");
		em.getTransaction().begin();
		    em.persist(employee);       // 15 Insert Record 
		    em.getTransaction().commit();
 
		/* Retrieve entity */
		    System.out.println("Retrive  Record");
		employee = em.find(Employee.class, 15);  // retrive 15 record 
		System.out.println(employee);
 
		/* Update entity */
	//	em.getTransaction().begin();
	//	employee.setFirstname("Babu");
	//	System.out.println("Update Employee Name is  :- " + employee);
	//	em.getTransaction().commit();
 
		/* Remove entity */
		System.out.println("Remove Record");
		em.getTransaction().begin();
		em.remove(employee);                   // remove 15 record 
		em.getTransaction().commit();
 
		/* Check whether enittiy is removed or not */
		System.out.println("Retrive  Record");
		employee = em.find(Employee.class, 15);      // find  null
		System.out.println("Employee after removal :- " + employee);
 
	}
}

