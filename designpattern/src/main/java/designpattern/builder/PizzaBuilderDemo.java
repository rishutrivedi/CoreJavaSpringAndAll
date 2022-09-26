package designpattern.builder;

public class PizzaBuilderDemo {

	public static void main(String[] args) {
	 Waiter waiter = new Waiter();
	 PizzaBuilder nykPizzaBuilder = new NYKPizzaBuilder();
	 
	 waiter.setPizzaBuilder(nykPizzaBuilder);
	 waiter.constructPizza();
	 
	 Pizza pizza = waiter.getPizza();
	 
	 System.out.println(pizza.getDough());
	 System.out.println(pizza.getSauce());
	 System.out.println(pizza.getTopping());
	}

}