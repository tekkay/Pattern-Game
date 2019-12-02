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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.trocarEstado(new Nerfado());
        personagem.mover();
        
        Life life = new Life();
        life.setLife(24);
        life.setLife(26);
        Observador Detalhes = new Detalhes();
        life.adicionaObservador(Detalhes);
        Observador Painel = new Painel();
        life.adicionaObservador(Painel);
        life.notificarTodos();
        
        Modo m = new Modo();
        ModoDeAtirar Arco = new Arco();
        m.setModo(Arco);
        m.atira();
    }
    
}
