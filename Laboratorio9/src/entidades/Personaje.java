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
public abstract class Personaje {
    private String nombre;
    private int vida;
    private int nivel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void ataqueEspecialCombox2(Personaje atacado){
        this.atacar(atacado);
    }
    //cuando es hijo ellos mismos definen sus valores y el metodo mismo
    public abstract void atacar(Personaje atacado);
    
    public void defender (Personaje atacante){
        this.vida = this.vida+3;
    }
}
