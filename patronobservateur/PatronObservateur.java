/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservateur;

/**
 *
 * @author Sanou
 */
public class PatronObservateur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteSubject CS= new ConcreteSubject(1);
        ConcreteObserver CO= new ConcreteObserver(2);
        CS.setstate(1);
        CO.update();
    }
    
}