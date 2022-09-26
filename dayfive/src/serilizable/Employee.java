package serilizable;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer empId;
	private transient String empName;
	public Employee() {
	}
	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {                                               
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}