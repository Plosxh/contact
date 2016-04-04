/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author IUT2
 */
public class UtiliserJComboBox {
    
    public UtiliserJComboBox() {
        // Instanciation de la fenêtre 
        JFrame window = new JFrame();
        // Indique de sortir du programme lorsque la fenêtre est fermée par l'utilisateur
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Définit la taille de la fenêtre en pixels
        window.setSize(900, 800);
        
        JPanel unPanel = new JPanel();
        unPanel.setLayout(new GridLayout(3,2)) ;
        
        window.add(unPanel) ;
        
        // --------------------------------------------------------------------
        // 1ère Forme de liste
        unPanel.add(new JLabel("Un choix dans une liste déroulante :")) ;

        JComboBox listeDeroulante1 = new JComboBox();
        
        // Ajout une à une des options dans la liste déroulante
        listeDeroulante1.addItem("Choix 1");
        listeDeroulante1.addItem("Choix 2");
        listeDeroulante1.addItem("Choix 3");

        unPanel.add(listeDeroulante1);
        
        // Remarque : on ne sait pas sélectionner un choix dans listeDeroulante1
        // (il faut connaitre l'objet à sélectionner et avec cette façon de faire,
        // on ne connait pas les objets qui sont des items de la liste)
        // ==> le premier objet inséré est sélectionné par défaut
        
        // Relecture de l'item sélectionné
        System.out.println("Choix dans la liste n°1 : " + listeDeroulante1.getSelectedItem());

        // --------------------------------------------------------------------
        // 2ème Forme de liste
        unPanel.add(new JLabel("Un choix dans une autre liste déroulante :")) ;
        JComboBox listeDeroulante2 = new JComboBox();
        
        // Ajout une à une des options dans la liste déroulante
        String choix1DeListeDeroulante2 = "Autre choix 1"; 
        listeDeroulante2.addItem(choix1DeListeDeroulante2);
        String choix2DeListeDeroulante2 = "Autre choix 2"; 
        listeDeroulante2.addItem(choix2DeListeDeroulante2);
        String choix3DeListeDeroulante2 = "Autre choix 3"; 
        listeDeroulante2.addItem(choix3DeListeDeroulante2);

        unPanel.add(listeDeroulante2);
        
        // Cette fois on peut indiquer quel est l'objet sélectionné
        listeDeroulante2.setSelectedItem(choix2DeListeDeroulante2);
        
        // Relecture de l'item sélectionné
        System.out.println("Choix dans la liste n°2 : " + listeDeroulante2.getSelectedItem());
        
        // --------------------------------------------------------------------
        // 3ème Forme de liste
        unPanel.add(new JLabel("Un dernier choix dans une liste déroulante :")) ;
        
        // On instancie un ensemble de choix possibles, chaque choix
        // a un "nom" (A, B, C,..) et un libellé (une chaîne)
        HashMap<String, String> lesChoixDeLaListe3 = new HashMap<String, String>();
        lesChoixDeLaListe3.put("Dernier choix 1", "A");
        lesChoixDeLaListe3.put("Dernier choix 2", "B");
        lesChoixDeLaListe3.put("Dernier choix 3", "C");
        lesChoixDeLaListe3.put("Dernier choix 4", "D");
        lesChoixDeLaListe3.put("Dernier choix 5", "E");
        lesChoixDeLaListe3.put("Dernier choix 6", "F");
        lesChoixDeLaListe3.put("Dernier choix 7", "G");
        
        // On crée une liste déroulante en lui affectant directement tous
        // les items de lesChoixDeLaListe3
        JComboBox listeDeroulante3 = new JComboBox(lesChoixDeLaListe3.keySet().toArray());
        unPanel.add(listeDeroulante3);
        
        // On sélectionne un item au hasard
        Random rand = new Random();
        int randomNum = rand.nextInt(lesChoixDeLaListe3.size() + 1);
        System.out.println("On va sélectionner le " + randomNum + "ème élément de la liste") ;
        listeDeroulante3.setSelectedIndex(randomNum);
        
        // Affichage de l'item sélectionné
        String choixSelectionne = (String) listeDeroulante3.getSelectedItem();
        System.out.println("Choix dans la liste n°3 : " + choixSelectionne + " soit le choix " + lesChoixDeLaListe3.get(choixSelectionne));
        
        window.setVisible(true);
    }
    
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserJComboBox exemple = new UtiliserJComboBox() ;
    }
}
