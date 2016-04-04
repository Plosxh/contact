/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author IUT2
 */
public class UtiliserJLabel {
    
    public UtiliserJLabel() {
        // Instanciation de la fenêtre 
        JFrame window = new JFrame();
        // Indique de sortir du programme lorsque la fenêtre est fermée par l'utilisateur
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Définit la taille de la fenêtre en pixels
        window.setSize(900, 800);
        
        JPanel unPanel = new JPanel();
        unPanel.setLayout(new GridLayout(1,2)) ;
        
        unPanel.add(new JLabel("Un JLabel")) ;

        JLabel unAutreLabel = new JLabel();
        unAutreLabel.setText("Un autre JLabel");
        unAutreLabel.setHorizontalAlignment(JLabel.RIGHT);
        unAutreLabel.setVerticalAlignment(JLabel.BOTTOM);
        unAutreLabel.setFont(new Font("Serif", Font.PLAIN, 18)) ;
        unAutreLabel.setForeground(Color.blue);
        
        unPanel.add(unAutreLabel);
        
        window.add(unPanel) ;
        window.setVisible(true);  
    }
    
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserJLabel exemple = new UtiliserJLabel() ;
    }
}
