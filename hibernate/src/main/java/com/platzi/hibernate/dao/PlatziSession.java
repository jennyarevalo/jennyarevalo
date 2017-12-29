package com.platzi.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {
	
	private Session session;
	
	public PlatziSession() {
	
		Configuration configuration = new Configuration(); //Leer nuestro archivo de configuraacion de BD
		configuration.configure(); //Inicia la configuracion de la sesion de nuestra BD
		SessionFactory sessionFactory = configuration.buildSessionFactory(); //Abre la puerta
	    session = sessionFactory.openSession(); //Nos va permitar ejecutar acciones a la BD		
	    session.beginTransaction();
		
	}
	
	
	public Session getSession() {
			
		return session;
	}

	
}
