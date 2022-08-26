package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Ramesh");
		student.setStudentId(33);
		
		em.persist(student);  //-- session.save(student)- > stmt.executeUpdate(student)-> mysqldb
		
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}
