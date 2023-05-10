package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.DtoClass;

public class DaoClass {
EntityManagerFactory emf= Persistence.createEntityManagerFactory("CRUD");
EntityManager em= emf.createEntityManager();
EntityTransaction et = em.getTransaction();

public void Create(DtoClass dt )
{
	et.begin();
	em.persist(dt);
	et.commit();
}
}
 