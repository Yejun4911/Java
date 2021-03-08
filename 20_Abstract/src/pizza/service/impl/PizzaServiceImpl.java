package pizza.service.impl;

import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceImpl implements PizzaService{
	static final PizzaServiceImpl service = new PizzaServiceImpl();
	private PizzaServiceImpl() {}
	public static PizzaServiceImpl getInstance() {
		return service;
	}
	 // 031 8082 7612
public void allMakePizza(Pizza[] pizzas) {
		for(Pizza p :pizzas) {
			System.out.println(p.toString());
			p.makePizza();
			System.out.println("");
		}//for
	}//all
}
