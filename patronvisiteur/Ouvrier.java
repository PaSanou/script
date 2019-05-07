/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisiteur;



public class Ouvrier implements IEntreprise {
	private int salhor;
	private int nbrh;
	
	public int getSalaireOuvrier() {
		return salhor*nbrh+10000;
	}
	
	

	
	public Ouvrier(int salhor, int nbrh, int salaireOuvrier) {
		// TODO Auto-generated constructor stub
		super();
		this.salhor=salhor;
		this.nbrh=nbrh;
		
	}




	@Override
	public void accept(IVisiteur v) {
		// TODO Auto-generated method stub
		v.VOuvrier(this);

	}

}
