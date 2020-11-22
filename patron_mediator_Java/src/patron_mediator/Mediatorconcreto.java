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
class Mediatorconcreto {
    
    private colegaConcreto1 usuario1;
    private colegaConcreto2 usuario2;
    
    public void setColega1(colegaConcreto1 colega1) {
    usuario1 = colega1;}
    
    public void setColega2(colegaConcreto2 colega2){
    usuario2 = colega2;}
    
    public void send(String mensaje, colega colega)
    {
        if(colega == usuario1)
        {
            usuario2.mensajerecivido(mensaje);
        }
        
        else if(colega == usuario2)
        {
            usuario2.mensajerecivido(mensaje);
        }
    }

}
