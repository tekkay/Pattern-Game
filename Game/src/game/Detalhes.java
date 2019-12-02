/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Administrador
 */
public class Detalhes implements Observador{

    @Override
    public void notificar(Life life) {
        System.out.println(" Detalhes dos danos tomados");
        System.out.println("Pisca tela em vermelho");
    }
    
}
