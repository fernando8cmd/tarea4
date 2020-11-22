/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_mediator;

/**
 *
 * @author Fernado
 */
public class Patron_mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mediatorconcreto mediator = new Mediatorconcreto();
        mediator Mediator = null;
        
        colegaConcreto1 colega1 = new colegaConcreto1(Mediator);
        colegaConcreto2 colega2 = new colegaConcreto2(Mediator);
        
        mediator.setColega1(colega1);
        mediator.setColega2(colega2);
        
        colega1.send("Hola, Que tal?");
        colega2.send("Bien, deseando las vacaciones");
         
        
        
        // TODO code application logic here
    }
    
}
