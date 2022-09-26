package jpaapp.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpaapp.entities.Department;
import jpaapp.entities.Employee;
import jpaapp.utility.HibernateUtility;

public class JPAMainApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Department dept = new Department();	
		dept.setDeptName("IT");
		
		Employee emp = new Employee();
		emp.setFirstName("shivam");
		emp.setLastName("kumar");
		emp.setSalary(6611115.55);
		emp.setDepartment(dept);
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Mahesh");
    	emp1.setLastName("Kumar");
		emp1.setSalary(911444.55);
		emp1.setDepartment(dept);
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp);
		
		session.persist(emp);
		session.persist(emp1);
				
		session.persist(dept);
		
		session.getTransaction().commit();

		
//		Department dept = session.find(Department.class, 2);

//		emp1.setDepartment(dept);
//		
//		
//		
//		dept.setEmployee(empSet);
//		
//		
//		session.persist(emp1);
//		/**
//		//Find 
//		Employee employee = session.find(Employee.class, 4);
//		System.out.println(employee);
//	**/
//		
	}

}
