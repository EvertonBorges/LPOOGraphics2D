/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;

/**
 *
 * @author Borges
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste Quadrado");
        Quadrado quadrado = new Quadrado(100, 40, 40, false);
        //quadrado.setBackground(Color.red);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(quadrado);
        janela.setSize(500, 500);
        janela.setVisible(true);
    }
    
}
