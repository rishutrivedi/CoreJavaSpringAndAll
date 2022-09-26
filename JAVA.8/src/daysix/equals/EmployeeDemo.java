package daysix.equals;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ayush");
		
		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setEmpName("Jyotika");
		
		Employee e2 = new Employee();
		e2.setEmpId(11);
		e2.setEmpName("Ayush");
		
		Employee e3 = new Employee();
		e3.setEmpId(11);
		e3.setEmpName("Tinku");
		
		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
		System.out.println(e.equals(e3));
		System.out.println("Hashcode of e----"+e.hashCode());
		System.out.println("Hashcode of e1----"+e1.hashCode());
		System.out.println("Hashcode of e2----"+e2.hashCode());
		System.out.println("Hashcode of e3----"+e3.hashCode());
	}

}
