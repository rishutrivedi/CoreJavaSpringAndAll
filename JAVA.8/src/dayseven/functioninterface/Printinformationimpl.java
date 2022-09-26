package dayseven.functioninterface;

public class Printinformationimpl implements PrintInformation {

	@Override
	public void printMesasage(String message) {
		System.out.println(message);
	}
	public void display() {
		System.out.println("I am a display function");
	}
}
