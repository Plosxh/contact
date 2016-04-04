/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import m1109.nf.Contact;
import m1109.nf.DispoSortie;
import m1109.nf.Hobby;
import m1109.nf.Mois;
import m1109.nf.Region;

/**
 *
 * @author IUT2
 */
public class UtiliserContact {
    public UtiliserContact() {
    }
    public void montrerUtilisationContact() {
        // Instanciation d'un contact
        Contact contact = new Contact();
        
        // Le contact a été instancié avec des valeurs par défaut : 
        // On peut afficher ses attributs dans la console
        contact.afficherDansConsole();
        
        contact.setDateNaissance(2002, Mois.NOVEMBRE, 22);
        contact.setNom("arthur");
        contact.setPrenom("martin");
        contact.setEmail("arthur@martin.com");
        contact.setNumeroTelephone("01 02 03 04 05");
        contact.setRegion(Region.PACA);
                
        contact.setDisponibilite(DispoSortie.NUIT);
        
        contact.addHobby(Hobby.SPORT);
        contact.addHobby(Hobby.LECTURE);
        
        // Le contact a été modifié : on l'affiche de nouveau dans la console 
        // pour vérifier que les modifications ont bien été prises en compte
        contact.afficherDansConsole();
   }
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserContact exemple = new UtiliserContact() ;
        exemple.montrerUtilisationContact();
    }
}
