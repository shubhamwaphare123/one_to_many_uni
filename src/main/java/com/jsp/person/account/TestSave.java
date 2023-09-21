package com.jsp.person.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shubham");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setCno(1234567);
		person.setEmail("xyz@mail.com");
		person.setName("xyz");
		person.setGender("male");
		
		Account account1=new Account();
		account1.setAcc_no(12345679);
		account1.setBank_name("sbi");
		account1.setIfsc("5432");
		
		
		Account account2=new Account();
		account2.setAcc_no(12345679);
		account2.setBank_name("sbi");
		account2.setIfsc("5432");
		
		
		Account account3=new Account();
		account3.setAcc_no(12345679);
		account3.setBank_name("sbi");
		account3.setIfsc("5432");
		
		Account account4=new Account();
		account4.setAcc_no(12345679);
		account4.setBank_name("sbi");
		account4.setIfsc("5432");
		
		List<Account>account = new ArrayList();
		account.add(account4);
		account.add(account3);
		account.add(account2);
		account.add(account1);
		person.setAccount(account);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityManager.persist(account4);

		entityTransaction.commit();

		
		
				

	}

}
