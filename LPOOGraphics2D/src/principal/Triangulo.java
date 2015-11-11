package principal;

import java.awt.Graphics;
import java.awt.Polygon;

public class Triangulo extends Quadrilatero{
    private double area;
    private double diagonal;
    private int posX;
    private int posY;
    private boolean vazado;
    private boolean principal;

    public Triangulo() {
        
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo(int posX, int posY, double base, double altura, boolean vazado, boolean principal) {
        super(base, altura);
        this.posX = posX;
        this.posY = posY;
        this.vazado = vazado;
        this.principal = principal;
        setSize((int) base, (int) altura + 1);
        if (principal){
            setLocation(posX, posY);
        } else {
            setLocation(posX, posY);
        }
        setLayout(null);
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

    public void setPrincipal(boolean principal) {
        this.principal = principal;
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

    public boolean isPrincipal() {
        return principal;
    }
    
    public void setPosicao(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        setLocation(posX, posY);
    }
    
    public void setPosicao(int posX, int posY, boolean vazado){
        this.posX = posX;
        this.posY = posY;
        this.vazado = vazado;
        setLocation(posX, posY);
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
        Polygon poligono = new Polygon();
        if (principal){
            poligono.addPoint(0, 0);
            poligono.addPoint(0, (int) getAltura());
            poligono.addPoint((int) getBase(), (int) getAltura());
        } else {
            poligono.addPoint(0, (int) getAltura());
            poligono.addPoint((int) getBase(), (int) getAltura());
            poligono.addPoint((int) getBase(), 0);
        }
        
        if (vazado) {
            g.drawPolygon(poligono);
        } else {
            g.fillPolygon(poligono);
        }
    }
}