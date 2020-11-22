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
public class colegaConcreto1 extends colega {
    
    public colegaConcreto1(mediator mediador){
        super(mediador);
    }
    
    
    public void send(String mensaje)    {
        mediador.send(mensaje, this);
    }
    
    public void mensajerecivido(String mensaje){
        System.out.println("colega1 recivio el mensaje: " + mensaje);
  }
    
    
    
}


