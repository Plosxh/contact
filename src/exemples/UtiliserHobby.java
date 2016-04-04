/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemples;

import m1109.nf.Hobby;

/**
 *
 * @author IUT2
 */
public class UtiliserHobby {
    public UtiliserHobby() {
    }
    public void montrerUtilisationHobby() {
        /*
         * Exemple avec l'énumération Hobby
         * Liste l'ensemble des hobby et compare avec un type de hobby
         */
        for (Hobby hobby : Hobby.values()) {
            if (hobby == Hobby.CINEMA) {
                System.out.println("Ce hobby est mon préféré : " + hobby); 
            } else {
                System.out.println("Je n'aime pas ce hobby : " + hobby);
            }
        }
   }
    /**
     * Main de l'exemple
     * @param args inutile
     */
    public static void main(String [] args) {
        UtiliserHobby exemple = new UtiliserHobby() ;
        exemple.montrerUtilisationHobby();
    }
}
