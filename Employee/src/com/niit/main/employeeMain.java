package com.niit.main;

import com.niit.enitity.employeeEntity;
import com.niit.model.employeeModel;


public class employeeMain {
public static void main(String[] args) {
	employeeEntity employee=new employeeEntity();
	employee.setEname("Kamlesh");
	employeeModel empmodel=new employeeModel();
	empmodel.Add(employee);
	
	
	
}
}
