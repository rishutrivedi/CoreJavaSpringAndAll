package designpattern.adapter;

import designpattern.adapter.thirdparty.GShape;
import designpattern.adapter.thirdparty.Rhombus;
import designpattern.adapter.thirdparty.Traingle;

public class ShapeObjectAdapter implements Shape {
	
	private GShape adaptee;
	
	
	public ShapeObjectAdapter(GShape adaptee) {
		this.adaptee = adaptee;
	}

	public void draw() {
		adaptee.drawShape();

	}

	
	public void resize() {
		System.out.println(description()+" can't be resized. Please create new one with required values. ");

	}

	@Override
	public String description() {
		if(adaptee instanceof Traingle) {
			return "Traingle object";
		}else if(adaptee instanceof Rhombus) {
			return "Rhombus object";
		}else {
			return "Unknown Object";
		}
	}

	@Override
	public boolean isHide() {

		return false;
	}

}