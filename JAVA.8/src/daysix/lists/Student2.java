package daysix.lists;

public class Student2 implements Comparable{
	private Integer  studentId;
	private String studentName;
	private Double marks;
	public Student2() {
	}

	public Student2(Integer studentId, String studentName, Double marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(this.marks == ((Student2)o).marks) {
			return 0;
		}else if (this.marks<((Student2)o).marks) {
			return 1;
		}else {
			return -1;
		}
	}

	
}
