/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.ComponentOrientation;
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
        JFrame janela = new JFrame();
        janela.setSize(800, 700);
        Quadrado quadrado = new Quadrado(100, 10, 10, true);
        Retangulo retangulo = new Retangulo(200, 100, 10, 120, true);
        Triangulo triangulo = new Triangulo(60, 80, 100, 500, false);
        janela.add(quadrado);
        janela.add(retangulo);
        janela.add(triangulo);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
}