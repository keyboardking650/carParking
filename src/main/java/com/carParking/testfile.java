package com.carParking;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.carParking.model.admin;

public class testfile {
	
	public static void main(String[] args) {
		System.out.println("test file ");
		
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-dummydb");
	    EntityManager em = emf.createEntityManager();
	    
	    admin ad = new admin();
	    
	    ad.setId(101);
	    ad.setName("varnika");
	    ad.setUsername("varnika_p");
	    ad.setPassword("123456789");
	    
	    
	    em.getTransaction().begin();
	    em.persist(ad);
	    em.getTransaction().commit();
	    
		
	}

}
