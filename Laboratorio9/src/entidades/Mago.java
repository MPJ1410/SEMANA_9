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
public class Mago extends Personaje{

    private int magia;
    private int sabiduria;
    
    public void lanzarHechizo(Personaje atancante){
        //IMPLEMENTAR
    }
    /**
     * @return the magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDevida= atacado.getVida();
        atacado.setVida(nivelActualDevida-8);
        atacado.defender(this);
    }
}
