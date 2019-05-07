/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisiteur;



public class Directeur implements IEntreprise {
	private int indice;
	private int salairebase;
	private int bonus;
	
	

	public Directeur(int indice, int salairebase, int bonus) {
		// TODO Auto-generated constructor stub
		super();
		this.indice=indice;
		this.salairebase=salairebase;
		this.bonus=bonus;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}


	public int getSalaireDirecteur() {
		return indice*salairebase+bonus;
	}


	public void setSalairebase(int salairebase) {
		this.salairebase = salairebase;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



	@Override
	public void accept(IVisiteur v) {
		// TODO Auto-generated method stub
         v.VDirecteur(this);
	}

}
