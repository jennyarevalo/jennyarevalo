package com.platzi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Juan Diaz", "Avatar");
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
	
		List<Teacher> list = teacherDaoImpl.pagination(10, 7);
		
		for (Teacher t: list) {
			System.out.println(t.getName());
		}
	}
}
