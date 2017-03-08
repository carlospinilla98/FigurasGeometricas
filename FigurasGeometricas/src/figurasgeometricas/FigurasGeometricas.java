/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;
import java.util.Scanner;
/**
 * @author Carlos Pinilla
 * @author Cristian Estevez
 */
public class FigurasGeometricas {
    double x, y;
    private Scanner teclado;
    /**
     * CONSTRUCTOR DE LA CLASE
     */
    public FigurasGeometricas() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    /**
     * METODO DE BIENVENIDA
     */
    private void mensajeBienvenida(){
        System.out.println("**BIENVENIDO**");
    }
    /**
     * METODO QUE DA INICIO AL MENU DE OPCIONES
     */
    private void iniciar() {        
        while(true) {
            System.out.println("1.Triangulo ");
            System.out.println("2.Circulo ");
            System.out.println("3.Cuadrado");
            System.out.println("4.Salir");
            System.out.print("OPCION : ");
            byte opcion =  teclado.nextByte();
            if(opcion == 1) {
                inicicarTriangulo();
            } else if(opcion == 2) {
                iniciarCirculo();
            } else if(opcion == 3) {
                inicicarCuadrado();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
    
    /**
     * METODO QUE TOMA LAS COORDENADAS DEL TRIANGULO Y LLAMA LAS OPERACIONES
     */
    private void inicicarTriangulo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Coordenadas punto1 = new Coordenadas(x, y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Coordenadas punto2 = new Coordenadas(x, y);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        Coordenadas punto3 = new Coordenadas(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();        
    }
    /**
     * METODO QUE TOMA LAS COORDENADAS DEL CIRCULO Y LLAMA LAS OPERACIONES
     */
    private void iniciarCirculo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Coordenadas punto1 = new Coordenadas (x,y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Coordenadas punto2 = new Coordenadas(x,y);
        Circulo circulo = new Circulo (punto1 , punto2);
        circulo.darResultadosCirculo();
    }
    /**
     * METODO QUE TOMA LAS COORDENADAS DEL CUADRADO Y LLAMA LAS OPERACIONES
     */
        private void inicicarCuadrado(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Coordenadas punto1 = new Coordenadas(x, y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Coordenadas punto2 = new Coordenadas(x, y);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        Coordenadas punto3 = new Coordenadas(x, y);
        System.out.print("Digite lado x4 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y4 : ");
        y = teclado.nextDouble();
        Coordenadas punto4 = new Coordenadas(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3,punto4);
        cuadrado.darResultadosCuadrado();        
    }
}