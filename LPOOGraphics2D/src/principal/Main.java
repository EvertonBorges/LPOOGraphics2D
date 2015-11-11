/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Borges
 */
public class Main extends JPanel{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        figura1();
        figura2();
        figura3();
        figura4();
    }
    
    private static void figura1(){
        JFrame janela = new JFrame();
        janela.setLayout(null);
        janela.setTitle("Figura 1");
        
        Triangulo triangulo1 = new Triangulo(40, 20, 60, 80, true, false);
        Triangulo triangulo2 = new Triangulo(100, 20, 60, 80, true, true);
        Retangulo retangulo1 = new Retangulo(40, 100, 120, 60, false);
        Quadrado quadrado = new Quadrado(40, 160, 120, true);
        Retangulo retangulo2 = new Retangulo(40, 280, 120, 60, false);
        
        janela.add(triangulo1);
        janela.add(triangulo2);
        janela.add(retangulo1);
        janela.add(quadrado);
        janela.add(retangulo2);
        
        janela.setSize(200, 420);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private static void figura2(){
        JFrame janela = new JFrame();
        janela.setLayout(null);
        janela.setTitle("Figura 2");
        
        Triangulo triangulo1 = new Triangulo(40, 20, 60, 80, false, false);
        Triangulo triangulo2 = new Triangulo(100, 20, 60, 80, false, true);
        Retangulo retangulo1 = new Retangulo(40, 100, 120, 60, true);
        Quadrado quadrado = new Quadrado(40, 160, 120, false);
        Retangulo retangulo2 = new Retangulo(40, 280, 120, 60, true);
        
        janela.add(triangulo1);
        janela.add(triangulo2);
        janela.add(retangulo1);
        janela.add(quadrado);
        janela.add(retangulo2);
        
        janela.setSize(200, 420);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private static void figura3(){
        JFrame janela = new JFrame();
        janela.setLayout(null);
        janela.setTitle("Figura 3");
        
        Triangulo triangulo1 = new Triangulo(40, 20, 60, 80, true, false);
        Triangulo triangulo2 = new Triangulo(100, 20, 60, 80, true, true);
        Quadrado quadrado1 = new Quadrado(75, 100, 50, false);
        Retangulo retangulo = new Retangulo(75, 150, 50, 100, true);
        Quadrado quadrado2 = new Quadrado(75, 250, 50, false);
        
        janela.add(triangulo1);
        janela.add(triangulo2);
        janela.add(quadrado1);
        janela.add(retangulo);
        janela.add(quadrado2);
        
        janela.setSize(220, 380);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private static void figura4(){
        JFrame janela = new JFrame();
        janela.setLayout(null);
        janela.setTitle("Figura 4");
        
        Triangulo triangulo1 = new Triangulo(40, 20, 60, 80, false, false);
        Triangulo triangulo2 = new Triangulo(100, 20, 60, 80, false, true);
        Quadrado quadrado1 = new Quadrado(75, 100, 50, true);
        Retangulo retangulo = new Retangulo(75, 150, 50, 100, false);
        Quadrado quadrado2 = new Quadrado(75, 250, 50, true);
        
        janela.add(triangulo1);
        janela.add(triangulo2);
        janela.add(quadrado1);
        janela.add(retangulo);
        janela.add(quadrado2);
        
        janela.setSize(220, 380);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}