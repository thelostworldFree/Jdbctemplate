package com.fuwei.service;

import java.util.List;

import com.fuwei.model.Student;

public interface StudentService {

	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int sid);
	
	public List<Student> findStudents();
}
