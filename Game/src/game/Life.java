/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Life {
    private List<Observador> listaDeObservadores = new ArrayList<>();
    private float life;
    private float lifeAnterior;

    public float getLifeAnterior() {
        return lifeAnterior;
    }

    public void setLifeAnterior(float lifeAnterior) {
        this.lifeAnterior = lifeAnterior;
    }

    
    
    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.lifeAnterior = this.life;
        this.life = life;
    }
    
    
    public void adicionaObservador(Observador o){
        listaDeObservadores.add(o);
    }
    public void notificarTodos(){
        for(Observador o:listaDeObservadores){
            o.notificar(this);
        }
    }
    
    
    
    
    
}
