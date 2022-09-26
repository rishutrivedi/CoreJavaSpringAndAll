package Assignment;

public class PrintCharacter {

	public static void main(String[] args) {
		String s="JAVAISTHEBEST";
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+"-");
			int number=s.charAt(i);
			System.out.println(number);
		}
	}

}
