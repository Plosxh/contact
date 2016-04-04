/*
 * Module 1109 : module IHM : Carnet d'adresse
 */
package m1109.ihm;

import m1109.nf.Contact;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
/**
 * @author IUT2
 */
public class IhmContact extends JPanel {

    private JTextField       champNom; // Widget de type champ texte pour afficher et saisir le nom du contact
    private JTextField       champPrenom;
    private JTextField       champRegion;
    private JTextField       champTel;
    private JTextField       champNaissance;
    //private JList       champHobby;
    private JTextField       champEmail;  
    private JTextField       champDispo;  
    /*
     * Formulaire pour saisir les informations relatives à un contact
     */
    public IhmContact() {
        super();

        initUIComponents();
    }
    
    /**
     * Crée et positionne les composants graphiques constituant l'interface
     */
    private void initUIComponents() {      
        /** Pour l'exemple **/
        
        // Ajoute dans l'IHM un libellé + un champ pour la saisie/Affichage du nom
        this.add(new JLabel("Nom :"));
        champNom = new JTextField(30);
        this.add(champNom);
        this.add(new JLabel("Prenom :"));
        champPrenom = new JTextField(30);
        this.add(champPrenom);
        this.add(new JLabel("Region :"));
        champRegion = new JTextField(30);
        this.add(champRegion);
        this.add(new JLabel("Telephone :"));
        champTel = new JTextField(30);
        this.add(champTel);
        this.add(new JLabel("Email :"));
        champEmail = new JTextField(30);
        this.add(champEmail);
        this.add(new JLabel("Date Naissance:"));
        champNaissance = new JTextField(30);
        this.add(champNaissance);
        
        String [] colonnes= {"Je n'aime pas","J'aime"};
        DefaultTableModel hobbies = new DefaultTableModel();
        hobbies.setColumnIdentifiers(colonnes);
        String [][] valeurs = {{"Cinema"}, {"Musique","Lecture","Sport"}};
        for (int i=0;i<valeurs.length; i++)
        {
            hobbies.addRow(valeurs[i]);
        }
        JTable table = new JTable(hobbies);
        
        this.add(table.getTableHeader());
        this.add(table);
        this.add(new JLabel("Date Dispo :"));
        champDispo = new JTextField(30);
        this.add(champDispo);
        
        /** TP 1 : à compléter **/
    }
    
    /**
     * Affecte des valeurs au formulaire de fiche contact
     * @param contact un contact pour mettre à jour à l'IHM
     * @return vrai si ok
     */
    public boolean displayContact(Contact contact) 
    {
        if (contact == null) { return false; }
                
        // Nom du contact
        champNom.setText(contact.getNom());
        champPrenom.setText(contact.getPrenom()); 
        champRegion.setText(contact.getRegion().toString());
        champTel.setText(contact.getNumeroTelephone());
        champNaissance.setText(contact.getDateNaissance());
        champDispo.setText(contact.getDisponibilite().toString());
        champEmail.setText(contact.getEmail());
        //champHobby.setSelectedIndex();
        
        
        /** TP 1 : à compléter **/
        
        return true;
    }
    
    /**
     * Relit les 
     * @param contact un contact à mettre à jour à partir de l'IHM
     * @return vrai si ok
     */
    public Boolean modifyContact(Contact contact) {
        if (contact == null) { return false; }

        // Affecte la valeur du champ nom à l'attribut nom du contact
        contact.setNom(champNom.getText());
        contact.setPrenom(champPrenom.getText()); 
        contact.setNumeroTelephone(champTel.getText()); 
        //contact.setDateNaissance(champNaissance.getText()); 
        //contact.setDisponibilite(champDispo.getText()); 
        contact.setEmail(champEmail.getText()); 
        //contact.addHobby(champHobby.getText());
        //contact.setRegion(champRegion.getText()); 
        
        // TODO : TP1 - renseigner les autres attributs du contact à partir des champs de l'IHM

        return true;
    }
}