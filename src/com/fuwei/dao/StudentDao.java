package com.fuwei.dao;

import java.util.List;

import com.fuwei.model.Student;

public interface StudentDao {

	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int id);
	
	public List<Student> findStudents();
}
