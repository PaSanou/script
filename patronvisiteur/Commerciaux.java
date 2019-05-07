/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisiteur;



public class Commerciaux implements IEntreprise {
    private int primevente;
	public Commerciaux(int primevente) {
		super();
		this.primevente = primevente;
	}
	

	public int getSalaireCom() {
		return primevente+10000;
	}


	public void setPrimevente(int primevente) {
		this.primevente = primevente;
	}

	

	@Override
	public void accept(IVisiteur v) {
		// TODO Auto-generated method stub
		v.VCommerciaux(this);

	}

}
