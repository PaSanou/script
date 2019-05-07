/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisiteur;


public class Calcul implements IVisiteur {
	private int salaire;
	public Calcul() {
		super();
		this.salaire = 0;
	}
	


	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}



	@Override
	public void VDirecteur(Directeur d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void VManager(Manager m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void VCommerciaux(Commerciaux c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void VOuvrier(Ouvrier o) {
		// TODO Auto-generated method stub

	}

}
