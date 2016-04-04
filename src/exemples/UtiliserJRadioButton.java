/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import m1109.nf.DispoSortie;

/**
 *
 * @author IUT2
 */
public class UtiliserJRadioButton {
    
    public UtiliserJRadioButton() {
        // Instanciation de la fenêtre 
        JFrame window = new JFrame();
        // Indique de sortir du programme lorsque la fenêtre est fermée par l'utilisateur
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Définit la taille de la fenêtre en pixels
        window.setSize(900, 800);
        
        JPanel unPanel = new JPanel();
        unPanel.setLayout(new GridLayout(1,2)) ;
        
        unPanel.add(new JLabel("Un choix unique :")) ;

        ButtonGroup groupeDispo = new ButtonGroup();
        JPanel panelBoutonsRadios = new JPanel(new GridLayout(1,3));
        
        // Création des boutons radio
        JRadioButton boutonRadio1 = new JRadioButton("Choix 1");
        JRadioButton boutonRadio2 = new JRadioButton("Choix 2");
        JRadioButton boutonRadio3 = new JRadioButton("Choix 3");

        // Ajout des boutons radio dans le panel (pour affichage)
        panelBoutonsRadios.add(boutonRadio1);
        panelBoutonsRadios.add(boutonRadio2);
        panelBoutonsRadios.add(boutonRadio3);

        // Ajout des boutons radio dans le groupe (pour que la sélection d'un
        // bouton déselectionne les autres)
        groupeDispo.add(boutonRadio1);
        groupeDispo.add(boutonRadio2);
        groupeDispo.add(boutonRadio3);
        
        // Ajout des boutons radio dans un HashSet (pour pouvoir les parcourir
        // en lecture, quand on cherchera lequel est sélectionné)
        HashSet<JRadioButton> ensembleDesBoutonsRadios = new HashSet<JRadioButton>();
        ensembleDesBoutonsRadios.add(boutonRadio1);
        ensembleDesBoutonsRadios.add(boutonRadio2);
        ensembleDesBoutonsRadios.add(boutonRadio3);
        
        unPanel.add(panelBoutonsRadios);
        
        window.add(unPanel) ;
        window.setVisible(true);  
        
        // Activation du bouton n°2
        boutonRadio2.setSelected(true);
        
        // Recherche du bouton sélectionné
        for (JRadioButton unBouton : ensembleDesBoutonsRadios) {
            if (unBouton.isSelected()) {
                System.out.println("Le bouton avec le texte '" + unBouton.getText() + "' est sélectionné");
            }
        }
    }
    
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserJRadioButton exemple = new UtiliserJRadioButton() ;
    }
}
