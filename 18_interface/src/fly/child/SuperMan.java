package fly.child;

import fly.parent.Flyer;

public class  SuperMan implements Flyer{

	@Override
	public void fly() {
		System.out.println("s fly");
		
	}

	@Override
	public void land() {
		System.out.println("s land");
		
	}

	@Override
	public void tack_off() {
		System.out.println("s tack_off");
		
	}

}
