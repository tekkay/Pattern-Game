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
public class Personagem {
    private Estado estadoAtual;
    
    public void trocarEstado(Estado novoEstado){
        this.estadoAtual = novoEstado;
    }
    
    public void mover(){
        estadoAtual.mover();
    }
    public void atirar(){
        estadoAtual.atirar();
    }
}
