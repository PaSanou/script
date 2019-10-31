/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfabrik;


public abstract class PizzaFactory {
	public static PizzaFactory getFactory(String type)
			{
		PizzaFactory pizza;
		if(type.equalsIgnoreCase("SN"))
		{
			pizza=new PizzaSN();
		}else if(type.equalsIgnoreCase("USA")) {
			pizza= new PizzaUS();
		}
		else {
			pizza= new PizzaFR();
		}
		  return pizza;
			}
	//factory method
	
	public abstract AbstractPizzaReine Createpizzareine();
	
	public abstract AbstractPizzaOriental CreatepizzaOriental();
	
	public abstract AbstractPizzaFrm CreatepizzaFrom();
	

}
