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

public class PizzaOrientFr extends AbstractPizzaOriental {
	private static final String pays= "France";
	public String getPays()
	{
		return pays;
	}
	
	public String toString()
	{
		return "Ingredients: huile d'olive /n sauce tomate /n eau /n levure de boulanger/n farine ";
	}

}

