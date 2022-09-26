package Shape;

public abstract class Quadrilateral {
	private int base;
	private int height;
	public Quadrilateral() {
		
	}
    public Quadrilateral(int base,int height) {
		this.base=base;
		this.height=height;
	}
	public abstract int area(int base,int height);
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
