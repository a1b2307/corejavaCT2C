package com.tnsif.client;

import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;
import com.tnsif.entity.Student;

public class Client {
	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		
		student.setSid(101);
		student.setSname("Kumar");
		student.setCgpa(8.5f);
		service.addStudent(student);
		System.out.println("Data Inserted");
	}

}