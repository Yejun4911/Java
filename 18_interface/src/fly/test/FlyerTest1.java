package fly.test;

import fly.child.AirPlane;
import fly.child.bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

public class FlyerTest1 {

	public static void main(String[] args) {
		Flyer f1 = new bird();
		Flyer f2 = new SuperMan();
		Flyer f3 = new AirPlane();
		
		Flyer[] flyers= {f1,f2,f3};
		
		for(Flyer f :  flyers) {
			if(f instanceof bird)
				System.out.println(((bird)f).layEgg());
			f.fly();
			f.land();
			f.tack_off();
		}

	}

}
