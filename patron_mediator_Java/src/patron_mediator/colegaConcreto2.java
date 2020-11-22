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
public class colegaConcreto2 extends colega{

    public colegaConcreto2(mediator mediador) {
        super(mediador);
    }

    @Override
    public void send(String mensaje) {
    mediador.send(mensaje, this);
            }

    @Override
    public void mensajerecivido(String mensaje) {
  System.out.println("Colega2 recibio el mensaje: " + mensaje);
    }

    
    
}
