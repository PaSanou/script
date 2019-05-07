/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisiteur;

/**
 *
 * @author Sanou
 */
public class PatronVisiteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Directeur D = new Directeur (4,800000,300000);
        Calcul cv = new Calcul();
        D.accept((IVisiteur) cv);
        System.out.println("Le salaire du Directeur est de : "  +D.getSalaireDirecteur());
        Commerciaux C = new Commerciaux(100000);
        Calcul v = new Calcul();
		C.accept((IVisiteur) v);
		System.out.println("Le salaire des Commerciaux est de : " +C.getSalaireCom());
		Ouvrier o = new Ouvrier(500,1000,5000);
		Calcul a = new Calcul();
		o.accept((IVisiteur) a);
		System.out.println("Le salaire des Ouvriers est de  : "  +o.getSalaireOuvrier());
	}
        

	}

