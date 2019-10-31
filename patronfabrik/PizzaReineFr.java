/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfabrik;

/**
 *
 * @author Sanou
 */

public class PizzaReineFr extends AbstractPizzaReine {
	private static final String pays= "France";
	public String getPays()
	{
		return pays;
	}
	public String  toString()
	{
		return" Ingredients: huile d'olive /n jambon /n champignon frais /n gruyere /n sauce tomate /n eau /n levure de boulanger/n farine ";
	}

}
