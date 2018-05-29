package com.niit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.niit.enitity.employeeEntity;

public class employeeUtil {
	SessionFactory sf = new AnnotationConfiguration().configure().addPackage("com.niit.entity").addAnnotatedClass(employeeEntity.class).buildSessionFactory();
public Session OpenSession()
{
	return sf.openSession();
}
}
