package com.niit.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.enitity.employeeEntity;
import com.niit.util.employeeUtil;

public class employeeModel {
public void Add(employeeEntity employee)
{
	Session session=new employeeUtil().OpenSession();
	Transaction tx=session.beginTransaction();
	session.save(employee);
	tx.commit();
	session.close();
}
}
