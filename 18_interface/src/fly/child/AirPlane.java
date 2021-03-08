package fly.child;

import fly.parent.Flyer;

public class  AirPlane implements Flyer{

	@Override
	public void fly() {
		System.out.println("a fly");
		
	}

	@Override
	public void land() {
		System.out.println("a land");
		
	}

	@Override
	public void tack_off() {
		System.out.println("a tack_off");
		
	}

}
