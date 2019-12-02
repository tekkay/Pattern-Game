/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Administrador
 */
public class Modo  {
    private ModoDeAtirar modo = new Pistola();
    
    public void setModo(ModoDeAtirar novoModo){
        this.modo = novoModo;
    }
    
    public void atira(){
       modo.atirar();
    }
    
}
