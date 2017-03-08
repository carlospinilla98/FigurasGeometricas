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
public class Triangulo {   
    /**
     * ATRIBUTO QUE ALOJA LA COORDENADA X1 Y1
     */
    private Coordenadas punto1;
    /**
     * ATRIBUTO QUE ALOJA LA COORDENADA X2 Y2
     */    
    private Coordenadas punto2;
    /**
     * ATRIBUTO QUE ALOJA LA COORDENADA X3 Y3
     */        
    private Coordenadas punto3;
    /**
     * GUARDA EL PERIMETRO DEL TRIANGULO
     */
    private double perimetro;
    /**
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Coordenadas punto1, Coordenadas punto2, Coordenadas punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
     /**
     * METODO QUE DA LOS RESULTADOS DEL TRIANGULO
     */
    public void darResultados() {
        if(isTriangulo() == true) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            System.out.println("Tipo de TRIANGULO : "+darTipoTriangulo());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    /**
     * RETORNA SI ES UN TRIANGULO 
     * @return 
     */
    private boolean isTriangulo() {
        if(punto1.getX() == punto2.getX() && punto2.getX() == punto3.getX()){
            return false;
        }else if(punto1.getY() == punto2.getY() && punto2.getY() == punto3.getY()){
            return false;
        } else{
            return true;
        }
    }
    /**
     * RETORNA LONGITUD DEL LADO AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * METODO RETORNA LONGITUD DEL LADO BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * METODO RETORNA LONGITUD DEL LADO CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * METODO QUE RETORNA EL PERIMETRO DE TRIANGULO
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    /**
     * METODO QUE RETORNA EL AREA DEL TRIANGULO
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    /**
     * METODO QUE RETORNA EL TIPO DE TRIANGULO
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        if(darLado1()==darLado2() && darLado1()== darLado3()){
            return "Triangulo Equilatero";
        }else if(darLado1()==darLado2() || darLado2()==darLado3() || darLado1()==darLado3()){
            return "Triangulo Isoceles";
        }else {
            return "Triangulo Rectangulo";
        }
    }
    /**
     * RETORNA LA COORDENADA X1 Y1
     * @return 
     */
    public Coordenadas getPunto1() {
        return punto1;
    }
    /**
     * MODIFICA LA COORDENADA X1 Y1
     * @param punto1 
     */
    public void setPunto1(Coordenadas punto1) {
        this.punto1 = punto1;
    }
    /**
     * RETORNA LA COORDENADA X2 Y2
     * @return 
     */
    public Coordenadas getPunto2() {
        return punto2;
    }
    /**
     * MODIFICA LA COORDENADA X2 Y2
     * @param punto2
     */
    public void setPunto2(Coordenadas punto2) {
        this.punto2 = punto2;
    }
     /**
     * RETORNA LA COORDENADA X3 Y3
     * @return 
     */
    public Coordenadas getPunto3() {
        return punto3;
    }
     /**
     * MODIFICA LA COORDENADA X3 Y3
     * @param punto3 
     */
    public void setPunto3(Coordenadas punto3) {
        this.punto3 = punto3;
    }
}