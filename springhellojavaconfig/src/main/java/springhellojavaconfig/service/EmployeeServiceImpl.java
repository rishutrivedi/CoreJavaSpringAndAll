package springhellojavaconfig.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springhellojavaconfig.dao.EmployeeDAO;
import springhellojavaconfig.model.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO employeeDao;
	
	
	public void save(Employee employee) {
		employeeDao.save(employee);

	}

	
	public Employee getById(int id) {
		
		return employeeDao.getById(id);
	}

	
	public void update(Employee employee) {
		employeeDao.update(employee);

	}

	
	public void deleteById(int id) {
		employeeDao.deleteById(id);

	}

	
	public List<Employee> getAll() {
	
		return employeeDao.getAll();
	}

}