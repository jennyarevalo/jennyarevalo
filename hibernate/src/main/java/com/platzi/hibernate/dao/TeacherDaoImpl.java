package com.platzi.hibernate.dao;

import java.util.List;

import org.hibernate.query.Query;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoImpl extends PlatziSession implements TeacherDao{

	private PlatziSession platziSession;
	
	
	public TeacherDaoImpl() {
		platziSession = new PlatziSession(); //Se instancia session para que cuando creamos un objeto tipo TeacherDaaoimpl se cree una sesion 
	}

	public void saveTeacher(Teacher teacher) {
		
		platziSession.getSession().persist(teacher); //Es mejor utilizar persist en lugar de save
		platziSession.getSession().getTransaction().commit();
	}

	public void deleteTeacherByid(Long id) {
		
		
	}

	public void updateTeacher(Teacher teacher) {
		
		
	}

	/*Metodo list() "lista de objetos cuando el select no tiene nada"
	nos retorna una lista con todos los objetos que ha retornado la consulta. En caso de que
	no se encuentre ningún resultado se retornará una lista sin ningún elemento.*/
	public List<Teacher> findAllTeachers() {
		
		Query query = platziSession.getSession().createQuery("from Teacher");
		List<Teacher> teachers = query.list();
	
		return teachers;
			
	}
	
	/*Metodo list() "Lista de Objeto cuando el select solo tiene un campo"*/
	public List<Object> findTeacherByName(){
		
		Query query = platziSession.getSession().createQuery("SELECT t.name FROM Teacher t");
		
		List<Object> listTeachers = query.list();
		
		return listTeachers;
	}
	
	/*Metodo list() "Lista de Array de Objetos cuando el select tiene mas de un campo*/
	public List<Object[]> findTeacherByFields(){
		
		Query query = platziSession.getSession().createQuery("SELECT t.idTeacher, t.name FROM Teacher t");
		
		List<Object[]> listTeachers = query.list();
		
		return listTeachers;
	}

	/*Paginacion*/
	
	public List<Teacher> pagination(int sizePage, int ShowPage){
		
		Query query = platziSession.getSession().createQuery("SELECT t.name FROM Teacher t Order By t.name");
		query.setMaxResults(sizePage);
		query.setFirstResult(ShowPage * sizePage);
		List<Teacher> teachers = query.list();
		
		return teachers; 
		
	}
	
	public Teacher findById(Long idTeacher) {
		
		return null;
	}

	public Teacher findByName(String name) {
		
		return null;
	}

}
