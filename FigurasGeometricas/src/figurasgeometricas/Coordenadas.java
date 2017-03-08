/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * @author Carlos Pinilla
 * @author Cristian Estevez
 */
public class Coordenadas {   
    /**
     * ATRIBUTO QUE ALOJA LA COORDENADA X
     */
    private double x;
    /**
     * ATRIBUTO QUE ALOJA LA COORDENADA Y
     */    
    private double y;
    /**
     * CONSTRUCTOR DE LA CLASE QUE INICIALIZA LAS VARIABLES
     * @param x
     * @param y 
     */
    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * RETORNA LA COORDENADA X
     * @return X
     */
    public double getX() {
        return x;
    }
    /**
     * MODIFICA LA COORDENADA X
     * @param x
     */ 
    public void setX(double x) {
        this.x = x;
    }
    /**
     * RETORNA LA COORDENADA Y
     * @return Y
     */
    public double getY() {
        return y;
    }
    /**
     * MODIFICA LA COORDENADA Y
     * @param y
     */ 
    public void setY(double y) {
        this.y = y;
    }
}