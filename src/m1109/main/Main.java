/*
 * Module 1109 : module IHM : Carnet d'adresse
 */
package m1109.main;

/**
 *
 * @author IUT2
 */



import m1109.ihm.IhmContact;
import m1109.nf.Contact;
import m1109.nf.Hobby;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static Contact contact;             // Un contact que l'on va afficher / modifier
    public static IhmContact ihmContact;      // L'IHM permettant d'afficher un contact
    public static JFrame window;                // Une fenêtre dans laquelle on va afficher l'IHM
        
    public static void main(String[] args) {        
        // Instanciation d'un contact
        contact = new Contact();

        // TODO : TP1 - renseigner les attributs d'un contact
        
        // Affiche l'IHM d'un contact
        afficherIhmContact();
    }
    
    public static void afficherIhmContact() {
        // Instanciation de la fenêtre 
        window = new JFrame();
        // Indique de sortir du programme lorsque la fenêtre est fermée par l'utilisateur
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Définit la taille de la fenêtre en pixels
        window.setSize(900, 800);
        

        // Instanciation de l'IHM d'un contact
        ihmContact = new IhmContact();
        // Affectation des attributs du contact aux champs de l'IHM
        ihmContact.displayContact(contact);


        // Ajout de l'IHM dans la fenêtre
        window.getContentPane().setLayout(new BorderLayout());
        window.add(ihmContact, BorderLayout.CENTER);
        
        // Ajout d'un bouton dans la fenêtre (pour tester la méthode getValues de IhmContact)
        JButton testGet = new JButton("Tester IhmContact.modifyContact()");
        window.add(testGet, BorderLayout.SOUTH);
        
        // Gestion des événements (ici le clic) du bouton
        testGet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message;
                
                ihmContact.modifyContact(contact);
                
                // Affiche le contact sur la console
                contact.afficherDansConsole();
                
                // Affiche le contact dans un popup
                
                // Nom du contact
                message  = "nom : " + contact.getNom() + "\n";
                // Prénom du contact
                message += "prenom : " + contact.getPrenom() + "\n";
                // Région du contact
                message += "region : " + contact.getRegion() + "\n";
                // Email du contact
                message += "email : " + contact.getEmail() + "\n";
                // Téléphone du contact
                message += "telephone : " + contact.getNumeroTelephone() + "\n";
                // Date de naissance du contact
                message += "date de naissance : " + contact.getDateNaissance() + "\n";
                // Disponibilité préférée du contact
                message += "dispo : " + contact.getDisponibilite() + "\n";

                // Liste des hobbys du contact
                for(Hobby hobby : contact.getHobbies()) {
                    // Remarque :   Java va appeler automatiquement 
                    //              hobby.toString() qui est redéfini dans Hobby 
                    //              pour renvoyer le libellé du hobby
                    message += "hobbby : " + hobby + "\n"; 
                }

                // Affichage de message dans un popup
                JOptionPane.showMessageDialog(
                        window,
                        message, 
                        "Résultat du test", 
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        window.setVisible(true);        
    }    
}
