package exceptions;

public class Finally {

	public static void main(String[] args) {
/*try {
	int a=200,b=0;
	int c=a/b;
}catch(Exception e) {
	System.out.println(e);
}
// finally block run always
finally {
	System.out.println("I am in finnaly block");
}*/
try {
	int a=200,b=0;
	int c=a/b;
}
finally {
	System.out.println("I am in finnaly block");
}	
	}

}
