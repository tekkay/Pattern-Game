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
public class Buffado implements Estado{

    @Override
    public void mover() {
        System.out.println("2x mais rapido");
    }

    @Override
    public void atirar() {
        System.out.println("Atira com a mira quase perfeita");
    }
    
}
