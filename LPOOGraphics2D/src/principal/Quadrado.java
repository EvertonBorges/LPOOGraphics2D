/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Graphics;

/**
 *
 * @author Borges
 */
public class Quadrado extends Quadrilatero{
    private double area;
    private double diagonal;
    private int posX;
    private int posY;
    private boolean vazado;

    public Quadrado() {
        
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(double lado, int posX, int posY, boolean vazado) {
        super(lado, lado);
        this.posX = posX;
        this.posY = posY;
        this.vazado = vazado;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setVazado(boolean vazado) {
        this.vazado = vazado;
    }

    public double getArea() {
        return area;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isVazado() {
        return vazado;
    }
    
    public void setPosicao(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
    
    public void setPosicao(int posX, int posY, boolean vazado){
        this.posX = posX;
        this.posY = posY;
        this.vazado = vazado;
    }
    
    public double calcArea(double lado){
        setBase(lado);
        setAltura(lado);
        area = super.calcArea();
        return area;
    }
    
    public double calcDiagonal(double lado){
        setBase(lado);
        setAltura(lado);
        diagonal = super.calcDiagonal();
        return diagonal;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (vazado) {
            g.drawRect(posX, posY, (int) getBase(), (int) getAltura());
        } else {
            g.fillRect(posX, posY, (int) getBase(), (int) getAltura());
        }
    }
}