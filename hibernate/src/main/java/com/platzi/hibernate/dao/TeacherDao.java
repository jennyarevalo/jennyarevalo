package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);

	void deleteTeacherByid(Long id);
	
	void updateTeacher(Teacher teacher);
	
	List<Teacher>findAllTeachers();
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
	
	
	
}
