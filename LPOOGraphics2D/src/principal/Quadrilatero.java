/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Borges
 */
public class Quadrilatero extends PainelDesenho {
    private double base;
    private double altura;
    
    public Quadrilatero() {
    }

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public double calcArea(){
        return base*altura;
    }
    
    public double calcDiagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}