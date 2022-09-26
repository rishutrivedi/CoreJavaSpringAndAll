package jpaappwithannotations.dao;

import java.util.List;

import org.hibernate.Session;

import jpaappwithannotations.entities.Department;
import jpaappwithannotations.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();
	//Retrieve
	
	public List<Department> getAllDepartment() {
	//select * from department
	//Example of Hibernate Query Language
		
		return session.createQuery("select d from Department d",Department.class).getResultList();
	}

	//Retrieve by Primary Key
	
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	//Create -- add or insert  data in relational table
	
	public void addDepartment(Department department) {
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();

	}

	
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteDepartment(Integer deptNo) {
		// remove
				session.getTransaction().begin();
				Department d = new Department();
				d.setDeptNo(deptNo);
				session.delete(d);
				session.getTransaction().commit();

	}


	public Department getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer updateDepartmentUsingQuery(Department department) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteDepartmentByName(String deptName) {
		// TODO Auto-generated method stub

	}

}