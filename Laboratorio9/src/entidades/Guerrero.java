/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class Guerrero extends Personaje{
    private int fuerza;
    private int resistencia;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public void ataqueEspecial(Personaje atacado){
        //implementar
    }
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDevida= atacado.getVida();
        atacado.setVida(nivelActualDevida-10);
        atacado.defender(this);
    }
    
}
