/**
 * 
 */
package br.com;

/**
 * @author cbgomes
 *
 */
public class PizzaFactory {
	

	public static Pizzaria criarPizza(String tipo) {
		Pizzaria tipoPizza = null;
		
		if(tipo.equals("Queijo")) {
			tipoPizza = new PizzaQueijo();
			
		}else if(tipo.equals("Portuguesa")) {
			
			tipoPizza = new PizzaPortuguesa();
			
		}else if(tipo.equals("Frango")) {
			
			tipoPizza = new PizzaFrango();
			
		}else if(tipo.equals("Calabresa")) {
			
			tipoPizza = new PizzaCalabresa();
		}
		
		return tipoPizza;
		
	}
}




