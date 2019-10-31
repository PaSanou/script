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
public class PatronFabrik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pays="fr";
		
		PizzaFactory pizza;
		pizza= PizzaFactory.getFactory(pays);
		
		AbstractPizzaReine a= pizza.Createpizzareine();
		a.getPays();
		
		
		
		AbstractPizzaOriental b= pizza.CreatepizzaOriental();
		b.getPays();
		
		
		
		AbstractPizzaFrm c= pizza.CreatepizzaFrom();
		c.getPays();
		
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		

	}

}
