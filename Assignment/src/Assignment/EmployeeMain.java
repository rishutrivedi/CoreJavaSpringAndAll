package Assignment;
import java.util.ArrayList;
import java.util.Collections;


public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("shivam",10000,18));
		list.add(new Employee("rishu",20000,19));
		list.add(new Employee("akash",30000,20));
		list.add(new Employee("mohit",40000,21));
		list.add(new Employee("sachin",50000,22));
		
		System.out.println("sort by name");
		Collections.sort(list,new NameCompare());
		System.out.println(list);
		
		System.out.println("sort by salary");
		Collections.sort(list,new SalaryCompare());
		System.out.println(list);
		
		System.out.println("sort by age");
		Collections.sort(list,new AgeCompare());
		System.out.println(list);
		
		}
	}

