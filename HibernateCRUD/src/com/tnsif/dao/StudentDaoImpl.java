package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager entityManager;
	
	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
		
		
	}

	@Override
	public void deleteStudent(Student student) {
		entityManager.remove(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}