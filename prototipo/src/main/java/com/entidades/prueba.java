package com.entidades;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.interfaces.contactDao;

@Repository("try")
@Transactional
public class prueba implements contactDao {
	
	private SessionFactory sessionFactory;
	@Override
	public List<tryEntidades> findALL() {
		return sessionFactory.getCurrentSession().createQuery("select c from tryEntidades c").list();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
