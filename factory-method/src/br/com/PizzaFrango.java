package br.com;

public class PizzaFrango extends Pizza implements Pizzaria {

	
	@Override
	public String criarPizza() {
			
		return "Frango";
	}
}
