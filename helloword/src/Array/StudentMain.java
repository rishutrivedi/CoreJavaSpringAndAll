package Array;

public class StudentMain {

	public static void main(String[] args) {
		Student[] studentArr=new Student[5];
		studentArr[0]=new Student(1,"Jyoti","Doon");
		studentArr[1]=new Student(2,"Bist","Garwal");
		studentArr[2]=new Student(3,"Sharma","Haridwar");
		studentArr[3]=new Student(4,"Trivedi","Kanpur");
		studentArr[4]=new Student(5,"Jyoti","Doon");
		for(Student stud :studentArr) {
			System.out.println(stud);
		}
	}

}
