package pizza.child;

import pizza.parent.Pizza;

public class PineApplePizza extends Pizza {
	
	public PineApplePizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void topping() {
		System.out.println("PineApple Topping...Pizza");
		
	}

	
}
