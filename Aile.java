/**
 * Sous Classe pour L'Aile, (hérite de la classe Composant).
 */
public class Aile extends Composant {

    // Envergure de l'aile en mètres
    private float envergure;

    // Largeur moyenne de l'aile en mètres (calcul surface)
    private float largeur;

    // Indique si les ailes sonts équpées de winglets
    private boolean winglets;

    // Capacité des réservoirs en litres
    private float capaciteReservoirs;

    // Type de configuration des ailes (Basses, Haute, etc.)
    private String configurationAiles;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Aile.
     * Hérite de la classe composants:
     * 
     * @param nom                Nom de l'aile
     * @param poids              Poids de l'aile en kg
     * @param numeroSerie        Numéro de série unique à ce composent
     * @param prix               Prix de l'aile
     * Attributs spécifiques:
     * @param envergure          Envergure de l'aile en m
     * @param largeur            largeur de l'aile en m
     * @param winglets           Indique si les ailes sont équipées de winglets
     * @param capaciteReservoirs Capacité des réservoirs intégrés aux ailes en
     *                           litres
     * @param configurationAiles Type de configuration des ailes
     */
    public Aile(String nom, float poids, String numeroSerie, float prix,
            float envergure, float largeur, boolean winglets, float capaciteReservoirs,
            String configurationAiles) {
        // on passe les attributs communs au constructeur de la super classe
        super(nom, poids, numeroSerie, prix);
        // On asigne les valeurs aux attributs.
        this.envergure = envergure;
        this.largeur = largeur;
        this.winglets = winglets;
        this.capaciteReservoirs = capaciteReservoirs;
        this.configurationAiles = configurationAiles;
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Retourne l'envergure de l'aile.
     *
     * @return Envergure en mètres
     */
    public float getEnvergure() {
        return envergure;
    }

    /**
     * Modifie l'envergure de l'aile.
     *
     * @param envergure Nouvelle envergure en mètres
     */
    public void setEnvergure(float envergure) {
        this.envergure = envergure;
    }

    /**
     * Indique si les ailes possèdent des winglets.
     *
     * @return true si les winglets sont présents, sinon false
     */
    public boolean isWinglets() {
        return winglets;
    }

    /**
     * Modifie la présence des winglets.
     *
     * @param winglets true pour ajouter des winglets, false pour les retirer
     */
    public void setWinglets(boolean winglets) {
        this.winglets = winglets;
    }

    /**
     * Retourne la capacité des réservoirs intégrés aux ailes.
     *
     * @return Capacité en litres
     */
    public float getCapaciteReservoirs() {
        return capaciteReservoirs;
    }

    /**
     * Modifie la capacité des réservoirs intégrés aux ailes.
     *
     * @param capaciteReservoirs Nouvelle capacité en litres
     */
    public void setCapaciteReservoirs(float capaciteReservoirs) {
        this.capaciteReservoirs = capaciteReservoirs;
    }

    /**
     * Retourne la configuration des ailes.
     *
     * @return Type de configuration (exemple : "Delta", "Flèche", etc.)
     */
    public String getConfigurationAiles() {
        return configurationAiles;
    }

    /**
     * Modifie la configuration des ailes.
     *
     * @param configurationAiles Nouveau type de configuration
     */
    public void setConfigurationAiles(String configurationAiles) {
        this.configurationAiles = configurationAiles;
    }

    // *********************** METHODES **************************************
    /**
     * Calcul de la surface de l'aile.
     * 
     * @return Surface en mètres carrés
     */
    public float surface() {
        return (this.envergure * this.largeur);
    }

    /**
     * Affiche les détails de l'aile et ses propriétés spécifiques.
     *
     * @return super affiche + détails de l'aile
     */
    @Override
    public String afficherDetails() {
        return super.afficherDetails() + String.format("Aile: Envergure=%.1f, Surface=%.1f, Winglets=%b, Config=%s",
                this.envergure, surface(), this.winglets, this.configurationAiles);
    }
}
