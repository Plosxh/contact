package exemples;

import m1109.nf.DispoSortie;

/**
 *
 * @author IUT2
 */
public class UtiliserDispoSortie {
    public UtiliserDispoSortie() {
    }
    
    public void montrerUtilisationDispoSortie() {
        DispoSortie dispo = DispoSortie.WEEK_END;

        // Les 3 instructions suivantes sont équivalentes :
        //      - getLabel renvoie le libellé de la disponbilité
        //      - toString renvoie la disponibilité sous forme de String, mais 
        //                  surchargé pour renvoyer le libellé de la disponibilité
        //      - dispo (dans une concaténation) renvoie le toString() de la classe
        //                  qui renvoie le libellé de la disponibilité
        System.out.println("Disponibilité : " + dispo.getLabel());
        System.out.println("Disponibilité : " + dispo.toString());
        System.out.println("Disponibilité : " + dispo);
        
        /*
         * Exemple de comparaisons avec les disponibilités pour des sorties
         */
        if (dispo == DispoSortie.NUIT) {
            System.out.println("Oui, mais après 22h");
        } else if (dispo == DispoSortie.SOIR) {
            System.out.println("ok de 19h à 22h");
        } else if (dispo == DispoSortie.WEEK_END) {
            System.out.println("Plutot le samedi");
        }
    }
    
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserDispoSortie exemple = new UtiliserDispoSortie();
        exemple.montrerUtilisationDispoSortie();
    }
}
