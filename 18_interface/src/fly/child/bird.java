package fly.child;

import fly.parent.Flyer;

public class  bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("b fly");
		
	}

	@Override
	public void land() {
		System.out.println("b land");
		
	}

	@Override
	public void tack_off() {
		System.out.println("b tack_off");		
	}
	
	public String layEgg() {
		return "egg";	
	}

}
