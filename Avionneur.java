/**
 * Classe Avionneur qui définis les constructeurs d'avions.
 */
public class Avionneur {

    // Nom de l'avionneur (Airbus, Boeing, etc.). 
    private String nomAvionneur;

    // Nombre total d'avions construits par l'avionneur. 
    private int nombreTotalAvions;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Avionneur.
     *
     * @param nomAvionneur le nom de l'avionneur
     */
    public Avionneur(String nomAvionneur) {
        this.nomAvionneur = nomAvionneur;
        this.nombreTotalAvions = 0; // Initialise le compteur à 0
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Retourne le nom de l'avionneur.
     *
     * @return le nom de l'avionneur
     */
    public String getNomAvionneur() {
        return nomAvionneur;
    }

    /**
     * Modifie le nom de l'avionneur.
     *
     * @param nomAvionneur le nouveau nom de l'avionneur
     */
    public void setNomAvionneur(String nomAvionneur) {
        this.nomAvionneur = nomAvionneur;
    }

    /**
     * Retourne le nombre total d'avions construits par l'avionneur.
     *
     * @return le nombre total d'avions construits
     */
    public int getNombreTotalAvions() {
        return nombreTotalAvions;
    }

     // *********************** METHODES **************************************
    /**
     * Incrémente le nombre total d'avions construits par l'avionneur de 1.
     */
    public void incrementerNombreAvions() {
        this.nombreTotalAvions++;
    }

    /**
     * Decrémenter le nombre total d'avions construits par l'avionneur de 1.
     */
    public void decrementerNombreAvions() {
        this.nombreTotalAvions--;
        if (this.nombreTotalAvions < 0) {
            this.nombreTotalAvions = 0;
        }
    }
}
