/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Administrador
 */
public class Painel implements Observador {

    @Override
    public void notificar(Life life) {
        System.out.println("Detalhes dos danos tomados");
        if (life.getLife() < 30) {
            System.out.println("Vida baixando!, passou de "+life.getLife()+" para "+life.getLifeAnterior());
        } else {
            System.out.println("Vida estável...");
        }

    }
}
