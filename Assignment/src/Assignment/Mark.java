package Assignment;

 enum subject {
physics(90),
chemistry(95),
math(94);
private int value;
subject(int i) {
	this.value=i;
}
public int  getvalue() {
	return value;
}

}
 public class Mark{
	 public static void main(String[] args) {
		 int sum=0;
		 for(subject o:subject.values()) {
			 sum+=o.getvalue();
		 }
		 System.out.println(sum);
	 }
 }
