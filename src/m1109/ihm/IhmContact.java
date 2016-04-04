/*
 * Module 1109 : module IHM : Carnet d'adresse
 */
package m1109.ihm;


import m1109.nf.Contact;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.util.HashMap;
import m1109.nf.Hobby;
import m1109.nf.DispoSortie;
import m1109.nf.Region;
/**
 * @author IUT2
 */
public class IhmContact extends JPanel {

    private JTextField       champNom; // Widget de type champ texte pour afficher et saisir le nom du contact
    private JTextField       champPrenom;
    private JTextField      champDisponibilite;
    private JTextField      champRegionDisplay;
    private JComboBox       champRegion;
    private JTextField       champTel;
    private JTextField       champNaissance;
    private JCheckBox       champHobby;
    private JTextField       champEmail;  
    private ButtonGroup     champDispo;
    private HashMap<Integer, Hobby> hobbies;
    private JCheckBox       lecture;
    private JCheckBox       musique;
    private JCheckBox       cinema;
    private JCheckBox       sport;
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

        this.add(new JLabel("Telephone :"));
        champTel = new JTextField(30);
        this.add(champTel);
        this.add(new JLabel("Email :"));
        champEmail = new JTextField(30);
        this.add(champEmail);
        this.add(new JLabel("Date Naissance:"));
        champNaissance = new JTextField(30);
        this.add(champNaissance);

       /*for (Hobby hobby : Hobby.values()) {
            if (hobby == Hobby.CINEMA) {
                lierHobby(1,hobby); 
            } 
            else if(hobby == Hobby.LECTURE) {
               lierHobby(2,hobby);
            }
            else if(hobby == Hobby.MUSIQUE) {
               lierHobby(3,hobby);
            }
            else if(hobby == Hobby.SPORT) {
               lierHobby(4,hobby);
            }
        }
       
      cinema= new JCheckBox("cinema");
   
        */
          JLabel labelDispo= new JLabel("Disponibilite");
          this.add(labelDispo);
             champDispo=new ButtonGroup();
     
        for(DispoSortie dis : DispoSortie.values())
        {
            JRadioButton radbut = new JRadioButton(dis.toString());
            champDispo.add(radbut);
          
            this.add(radbut);
        }
        
        JLabel labelRegion = new JLabel("Region : ");
        this.add(labelRegion);
        
        Region[] region= Region.values();
        champRegion = new JComboBox(region);
        this.add(champRegion);
        
        for(Hobby h : Hobby.values())
        {
            JCheckBox check= new JCheckBox(h.toString());
            this.add(check);
        }
        
        


        
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
        String region = (String)champRegion.getSelectedItem().toString();
        champRegionDisplay = new JTextField();
        champRegionDisplay.setText(region);
        champTel.setText(contact.getNumeroTelephone());
        champNaissance.setText(contact.getDateNaissance());
        champDisponibilite = new JTextField();
        champDisponibilite.setText(contact.getDisponibilite().toString());
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
        for(DispoSortie dis : DispoSortie.values())
        {
            if (champDispo.toString()==dis.toString())
            {
                contact.setDisponibilite(dis);
            
            }
            
        }
        
        //contact.setDisponibilite(champDispo.getSelection()); 
        contact.setEmail(champEmail.getText()); 
        //contact.addHobby(champHobby.getText());
        contact.setRegion((Region) champRegion.getSelectedItem()); 
        
        // TODO : TP1 - renseigner les autres attributs du contact à partir des champs de l'IHM

        return true;
    }
    
    
    private void lierHobby(Integer numHobby,Hobby ho)
    {
        hobbies.put(numHobby,ho);
    }
    
    
}