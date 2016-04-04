/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author IUT2
 */
public class UtiliserJTextField {
    
    public UtiliserJTextField() {
        // Instanciation de la fenêtre 
        JFrame window = new JFrame();
        // Indique de sortir du programme lorsque la fenêtre est fermée par l'utilisateur
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Définit la taille de la fenêtre en pixels
        window.setSize(900, 800);
        
        JPanel unPanel = new JPanel();
        unPanel.setLayout(new GridLayout(1,2)) ;
        
        unPanel.add(new JLabel("libellé du champ :")) ;
        
        JTextField unChampTexte = new JTextField();
        unPanel.add(unChampTexte);
        
        window.add(unPanel) ;
        window.setVisible(true);  
        
        // Affectation d'une valeur au champ texte
        unChampTexte.setText("une chaîne de caractères");
        
        // Relecture de la valeur dans le champ texte
        System.out.println(unChampTexte.getText());
    }
    
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserJTextField exemple = new UtiliserJTextField() ;
    }
}
