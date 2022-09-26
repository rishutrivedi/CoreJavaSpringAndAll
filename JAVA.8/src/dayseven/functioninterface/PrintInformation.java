package dayseven.functioninterface;

public interface PrintInformation {
	public void printMesasage(String message);
	
	public default void printInfo() {
		System.out.println("I am into default method of function interface");
	}
	public static void printInformation() {
		System.out.println("I am into static method of function interface");
	}
}
