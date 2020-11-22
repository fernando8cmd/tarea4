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
public abstract class colega {
    
    protected mediator mediador;
    
    public colega(mediator mediador) {
        this.mediador = mediador;
    }
    
    public abstract void send(String mensaje);
    public abstract void mensajerecivido(String mensaje);
    
}
