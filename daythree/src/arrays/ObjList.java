package arrays;

public class ObjList {
	private int number;

	

	public ObjList(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "ObjList [number=" + number + "]";
	}

}