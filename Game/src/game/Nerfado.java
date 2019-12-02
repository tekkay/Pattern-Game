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
public class Nerfado implements Estado{

    @Override
    public void mover() {
        System.out.println("mover mais devagar");
    }

    @Override
    public void atirar() {
        System.out.println("Atira com dificuldade");
    }
    
    
}
