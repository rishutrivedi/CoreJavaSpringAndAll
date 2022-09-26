package dayseven.functioninterface;

/**
 * @author rishu.s
 *
 */
public class MainApp {

	public static void main(String[] args) {
	PrintInformation pii=new Printinformationimpl();
	// Printinformationimpl piii=new Printinformationimpl();
	pii.printMesasage("who u are");
	
	PrintInformation pi=(c)->System.out.println(c+" "+"hello here i define lambda expression");
			pi.printMesasage("hi");
	}
}
