/*
 * Module 1109 : module IHM : Carnet d'adresse
 */
package m1109.nf;

/**
 *
 * @author IUT2
 */
/*
 * Liste des mois de l'année
 */
public enum Mois implements java.io.Serializable {
    JANVIER("janvier"),
    FEVRIER("f\u00E9vrier"),
    MARS("mars"),    
    AVRIL("avril"),
    MAI("mai"),
    JUIN("juin"), 
    JUILLET("juillet"),
    AOUT("aout"),
    SEPTEMBRE("septembre"),
    OCTOBRE("octobre"),
    NOVEMBRE("novembre"),
    DECEMBRE("d\u00E9cembre");

    private final String label;
    
    private Mois(String label) { 
        this.label = label; 
    }
    
    public String toString() { return this.label; }     
}