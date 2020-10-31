package com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory factory; 

	@Override
	@Transactional
	public void save(Student student) {
		
		Session session = factory.getCurrentSession(); 
		
		session.saveOrUpdate(student);
	}

}
