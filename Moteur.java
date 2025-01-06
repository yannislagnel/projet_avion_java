/**
 * Sous Classe pour Moteur, (hérite de la classe Composant).
 */
public class Moteur extends Composant {

    // Puissance du moteur en kilowatts (kW)
    private float puissance;

    // Consommation du moteur en litres par heure (L/h)
    private float consommation;

    // Type de carburant utilisé par le moteur (Kérosène, Essence)
    private String carburant;
    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Moteur.
     * Hérite de la classe composants:
     * 
     * @param nom          Nom du moteur
     * @param poids        Poids du moteur en kg
     * @param numeroSerie  Numéro de série unique du moteur
     * @param prix         Prix du moteur
     * Attributs spécifiques:
     * @param puissance    Puissance du moteur en Newton (kN)
     * @param consommation Consommation en litres par heure (L/h)
     * @param carburant    Type de carburant utilisé
     */
    public Moteur(String nom, float poids, String numeroSerie, float prix,
            float puissance, float consommation, String carburant) {
        // on passe les attributs communs au constructeur de la super classe
        super(nom, poids, numeroSerie, prix);
        // On asigne les valeurs aux attributs.
        this.puissance = puissance;
        this.consommation = consommation;
        this.carburant = carburant;
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Retourne la puissance du moteur.
     *
     * @return Puissance en Newton (kN)
     */
    public float getPuissance() {
        return puissance;
    }

    /**
     * Modifie la puissance du moteur.
     *
     * @param puissance Nouvelle puissance en kilowatts (kW)
     */
    public void setPuissance(float puissance) {
        this.puissance = puissance;
    }

    /**
     * Retourne la consommation du moteur.
     *
     * @return Consommation en litres par heure (L/h)
     */
    public float getConsommation() {
        return consommation;
    }

    /**
     * Modifie la consommation du moteur.
     *
     * @param consommation Nouvelle consommation en litres par heure (L/h)
     */
    public void setConsommation(float consommation) {
        this.consommation = consommation;
    }

    /**
     * Retourne le type de carburant utilisé par le moteur.
     *
     * @return Type de carburant (exemple : "Kérosène", "Essence")
     */
    public String getCarburant() {
        return carburant;
    }

    /**
     * Modifie le type de carburant utilisé par le moteur.
     *
     * @param carburant Nouveau type de carburant
     */
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
 // *********************** METHODES **************************************
    /**
     * Affiche les détails du moteur et ses propriétés spécifiques.
     *
     * @return super affiche + détails du moteur
     */
    @Override
    public String afficherDetails() {
        return super.afficherDetails() + String.format("Moteur: Puissance: %.1f, Conso: %.1f, Carburant: %s",
                this.puissance, this.consommation, this.carburant);
    }
}
